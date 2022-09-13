object Q_1 extends App {
  class Rational(x:Int,y:Int){
    private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

    val numerator = x/gcd(x,y)
    val denominator = y/gcd(x,y)

    def neg = new Rational(-this.numerator,this.denominator)

    override def toString(): String = this.numerator.toString + " / " + this.denominator.toString

  }
  val number = new Rational(4,7)

  println(number)
  println(number.neg)
}
