package com.pt.pedrorijo91.akka.pingPong

import akka.actor.{Actor, ActorRef}

/**
 * Created by pedrorijo on 29/12/14.
 */



class Ping(pong: ActorRef) extends Actor{

  var count = 0

  def incAndPrint  : Unit = {
    count += 1
    println("ping #" + count)
  }

  def receive : Unit  = {
    case StartMessage => {
      incAndPrint
      pong ! PingMessage
    }
    case PongMessage => {
      incAndPrint
      if(count > 99) {
        sender ! StopMessage
        println("ping stopped")
        context.stop(self)
      }
      else {
        sender ! PingMessage
      }
    }
  }

}
