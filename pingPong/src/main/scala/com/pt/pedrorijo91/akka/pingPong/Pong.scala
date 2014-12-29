package com.pt.pedrorijo91.akka.pingPong

import akka.actor.Actor

/**
 * Created by pedrorijo on 29/12/14.
 */
class Pong extends Actor {

  def receive : Unit = {
    case PingMessage => {
      println("  pong")
      sender ! PongMessage
    }
    case StopMessage => {
      println("pong stopped")
      context.stop(self)
    }
  }
}
