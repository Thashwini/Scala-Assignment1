
object book extends App{
  def discount(x:Double)=x-x*0.4;
  def shippingCost(y:Double,z:Double)=y*z;
  def fullcost(x:Double,y:Double,z:Double)=x+y+z;
  println (fullcost(discount(24.95),shippingCost(3.00,50),shippingCost(0.75,10)));


}

