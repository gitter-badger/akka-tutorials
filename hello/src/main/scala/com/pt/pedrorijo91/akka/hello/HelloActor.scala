package com.pt.pedrorijo91.akka.hello

import akka.actor.{Props, ActorSystem, Actor}

/**
 * Created by pedrorijo on 29/12/14.
 */
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back to you")
    case _ => println("anh?")
  }
}