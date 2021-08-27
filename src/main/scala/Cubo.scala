
import Figura._

trait Figura

case class Cubo(base:Double)extends Figura
case class Esfera(radio:Double)extends Figura

object Figura {
  def volumen(f:Figura):Double = f match {
    case Cubo(a) => (a*a)*a
    case Esfera(r) => ((r*r*r*Math.PI)*4)/3
  }


}

object visualizar extends App{

  val esfera1:Figura = Esfera(4)
  val cubo1: Figura = Cubo(3)

  val esfera1Volumen = volumen(esfera1)
  val cubo1Volumenm = volumen(cubo1)

  println("el volumen es de la esfera: "+esfera1Volumen)
  println("el volumen es del cubo: "+cubo1Volumenm)

}
