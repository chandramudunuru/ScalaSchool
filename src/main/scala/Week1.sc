1+1
val bar:Int =10
//bar = 11

def add(a:Int,b:Int):Int=a+b


add(1,2)

//anonymus function

val addTo = (a:Int,b:Int) => a+b

class Calculator(val brand:String){

}

val cal:Calculator = new Calculator("TFLY")
cal.brand

case class BetterCalculator(brand:String){
  def add(a:Int,b:Int):Int=a+b

  def changeName(name:String) = BetterCalculator(name)
}

val bCal:BetterCalculator = BetterCalculator("Ticketfly")
bCal.brand
bCal.add(1,2)

