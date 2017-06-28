package $package$

import com.lightbend.lagom.scaladsl.persistence.PersistentEntity
import com.lightbend.lagom.scaladsl.persistence.PersistentEntity.ReplyType
import $package$.event._
import $package$.command._
import $package$.state._
import money.haven.crypto.Random

import scala.concurrent.ExecutionContext

object $name;format="Camel"$Entity {
  def newRef: String = {
    Random.randomReadableStringOfLength(10)
  }
}

class $name;format="Camel"$Entity(implicit ec: ExecutionContext) extends PersistentEntity {
  override type Command = $name;format="Camel"$Command
  override type State = Option[$name;format="Camel"$State]
  override type Event = $name;format="Camel"$Event

  override def initialState: Option[$name;format="Camel"$State] = None

  private val none = Actions()
    .onCommand[Create$name;format="Camel"$Command, akka.Done] {
      case (Create$name;format="Camel"$Command(userId), ctx, state) =>
        ctx.thenPersist($name;format="Camel"$CreatedEvent(userId))(_ => ctx.reply(akka.Done))
    }
    .onEvent {
      case ($name;format="Camel"$CreatedEvent(userId), None) =>
        Some($name;format="Camel"$State(userId))
    }

  override def behavior: Behavior = {
    case None => none
  }
}
