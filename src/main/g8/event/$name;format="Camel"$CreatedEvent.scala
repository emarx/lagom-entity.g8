package $package$.event

import play.api.libs.json.{Format, Json}

case class $name;format="Camel"$CreatedEvent(userId: String) extends $name;format="Camel"$Event

object $name;format="Camel"$CreatedEvent {
  implicit val format: Format[$name;format="Camel"$CreatedEvent] = Json.format
}
