package $package$.command

import com.lightbend.lagom.scaladsl.persistence.PersistentEntity.ReplyType
import play.api.libs.json.{Format, Json}

case class Create$name;format="Camel"$Command(amount: Double, accountId: String, userId: String)
  extends $name;format="Camel"$Command
    with ReplyType[akka.Done]

object Create$name;format="Camel"$Command {
  implicit val format: Format[Create$name;format="Camel"$Command] = Json.format
}
