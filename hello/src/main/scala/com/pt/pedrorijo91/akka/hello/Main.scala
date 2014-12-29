package com.pt.pedrorijo91.akka.hello

import akka.actor.{Props, ActorSystem}

/**
 * Created by pedrorijo on 29/12/14.
 */
object Main extends App{

    val system =  ActorSystem("lol")

    val helloActor = system.actorOf(Props(new HelloActor("Fred")), name = "helloactor")
    helloActor ! "hello"
    helloActor ! "hey"

}
