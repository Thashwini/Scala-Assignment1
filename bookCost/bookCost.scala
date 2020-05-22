
object bookCost extends App{
  def discount(x:Double)=x-x*0.4;
  def cost1(x:Double,y:Double)=x*y;
  def shippingCost(x:Double)=if (x>50) 50*3+(x-50)*0.75 else x*3;
  def fullcost(x:Double,y:Double)=x+y;

  println(fullcost(cost1(60,discount(24.95)),shippingCost(60)));

}
