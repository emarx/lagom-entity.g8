package $package$.event

import com.lightbend.lagom.scaladsl.persistence.{AggregateEvent, AggregateEventTag}

object $name;format="Camel"$Event {
  val NumShards = 5
  val Tag = AggregateEventTag.sharded[$name;format="Camel"$Event](NumShards)
}

trait $name;format="Camel"$Event extends AggregateEvent[$name;format="Camel"$Event] {
  override def aggregateTag = $name;format="Camel"$Event.Tag
}

