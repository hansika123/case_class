object Case_Class extends App{
    val p1 = new Point(1,2)
    val p2 = new Point(4,5)
    val p3 = p1.move(2,3)
    val p4 = p2.move(1,8)

    //print values
   printf ("\nGiven two points :\n")
   println("p1 = " +p1)
   println("p2 = " +p2)

   println("\nAddition of two points : ")
   println(p1+p2)

   println("\nAfter move a point p1 by a given distance dx = 2 and dy = 3 : ")
   println(p3)
   println("After move a point p2 by a given distance dx = 1 and dy = 8 : ")
   println(p4)


   println("\nDistance between two given points p1 and p2 : ")
   println(p1 distance p2)

   println("\nAfter switching the x and y coordinates of p1 and p2 : ")
   println("p1 = " +p1.invert)
   println("p2 = " +p2.invert)
}

//case class
import math.{sqrt,pow}
case class Point(a:Int,b:Int){
  def x:Int = a
  def y:Int = b

  //add given two points
  def +(that:Point) = Point(this.x+that.x , this.y+that.y)
    
  //move by distance dx and dy  
  def move(dx:Int,dy:Int) = Point(this.x+dx , this.y+dy)
    
  //distance between 2 points
  def distance(that:Point):Double = sqrt(pow(this.x-that.x,2) + pow(this.y-that.y,2))
    
  //switch the x and y coordinates of a point
  def invert :Point  = Point (this.y,this.x)
}






