import Holamundo.ingresoNumPrimo

import java.math
import java.io
import javax.swing._
import javax.xml._

case class Ejemplo()

object Holamundo extends App {
      def ingresoNumPrimo(a: Int): Boolean = {
            var swich: Boolean = true

            if (a % 2 == 0) {
                  swich = false
            }
            var i: Int = 3
            while (i * i <= a) {
                  if (a % i == 0 ) {
                        swich = false
                  }
                  i += 2

            }


            return swich

      }

      var primo = ingresoNumPrimo(21)
      print("el numero ingresado es primo:"+primo)


}

object funciones extends App{
//numera a punto 4
  def factorialIn (n:Long ): Long = {
    var r :Long= 1;
    if(n > 0)
    {
      r = n*factorialIn(n-1)
    }
    return r
  }

  var factorial = factorialIn(6)
  println("el numero factorial de : "+factorial)
// numeral b punto 4
  def numAlCubo (i:Long ): Long = {

    var u :Long = 0
    u = (i*i)*i
    return u
  }
   var cubo = numAlCubo(9)
  println("el cubo del numero es:"+cubo)
// numera c punto 4
  def sumaDeNs(j:Int): Int ={

     var x:Int = 0
     var resultado:Int = 0
     var sumaInicial:Int=0
     var numeroAgregado:Int=1
   do{
     resultado = sumaInicial + numeroAgregado;
     sumaInicial = resultado;
     numeroAgregado = numeroAgregado + 1;
     x = x+1
   }while (x < j)

    return resultado
  }

  def sumaDeNsFinal (k:Int , f :Int => Int): Int ={

    var resultadofinal: Int = f(k)

    return resultadofinal
  }

  val sumatoria:Int = sumaDeNsFinal(6,sumaDeNs)
  println("El resultado de la funcion de orden superior: "+sumatoria)
//numeral d punto 4

  def sumaDeNsFinal2 (k:Long , f :Long => Long): Long ={

    var resultadofinal: Long = f(k)

    return resultadofinal
  }
  val ensayo1:Long = sumaDeNsFinal2(3,factorialIn)
  println("el factorial es: "+ensayo1)
  val ensayo2:Long = sumaDeNsFinal2(3,numAlCubo)
  println("el cubo es: "+ensayo2)


}

}

