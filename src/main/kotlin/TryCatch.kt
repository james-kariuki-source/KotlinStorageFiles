fun main() {
   try{
       print("Enter a value: ")
       val num1: Int = readLine()!!.toInt()
       val num2: Int = 100/num1

       println("The result is $num2")
   } catch (ex:Exception){
       println(ex.message)
   }

    println("End of the program.")
}