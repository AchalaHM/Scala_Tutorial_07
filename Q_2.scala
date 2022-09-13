object Q_2 extends App {    class Rational(x:Int, y:Int){
  private def gcd(a:Int,b:Int):Int= if(b==0)a else gcd(b,a%b)
  val numerator = x/gcd(x,y)
  val denominator = y/gcd(x,y)

  def neg = new Rational(-this.numerator, this.denominator)

  def add(num:Rational):Rational = {
    new Rational(this.numerator*num.denominator + this.denominator*num.numerator, this.denominator*num.denominator)
  }

  def sub(r:Rational) = this.add(r.neg)

  override def toString(): String = this.numerator.toString + " / " + this.denominator.toString
}

  val n1 = new Rational(3,4)
  val n2 = new Rational(5,8)
  val n3 = new Rational(2,7)

  println(n1.sub(n2).sub(n3))
}
