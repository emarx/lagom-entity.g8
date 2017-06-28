package $package$.state

import play.api.libs.json.{Format, Json}

case class $name;format="Camel"$State(
  userId: String
) {
  def withUserId(userId: String): $name;format="Camel"$State = {
    copy(userId = userId)
  }
}

object $name;format="Camel"$State {
  implicit val format: Format[$name;format="Camel"$State] = Json.format
}
