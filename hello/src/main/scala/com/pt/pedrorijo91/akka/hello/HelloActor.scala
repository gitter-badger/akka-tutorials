package com.pt.pedrorijo91.akka.hello

import akka.actor.{Props, ActorSystem, Actor}

/**
 * Created by pedrorijo on 29/12/14.
 */
class HelloActor(myName : String) extends Actor {
  def receive : Unit = {
    case "hello" => println("hello from %s".format(myName))
    case _ => println("'huh?', said %s".format(myName))
  }
}