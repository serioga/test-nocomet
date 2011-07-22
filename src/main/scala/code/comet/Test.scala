package code.comet

import net.liftweb._
import http.CometActor
import util.Schedule
import util.Helpers._
import xml._

case object TestActorMessage

class Test extends CometActor {

  var counter = 0

  override def lowPriority = {
    case TestActorMessage => {
      counter += 1
      reRender()
      Schedule.schedule(this, TestActorMessage, 5 seconds)
    }
  }

  override protected def localSetup() {
    this ! TestActorMessage
  }

  def render = <div>Test comet actor. Counter={counter.toString}</div>
}
