package com.pt.pedrorijo91.akka.pingPong

import akka.actor.{Props, ActorSystem}

/**
 * Created by pedrorijo on 29/12/14.
 */
object PingPongTest extends App {

  val system = ActorSystem("PingPongSystem")

  val pong = system.actorOf(Props[Pong], name = "pong")
  val ping = system.actorOf(Props(new Ping(pong)), name = "ping")

  ping ! StartMessage
}
