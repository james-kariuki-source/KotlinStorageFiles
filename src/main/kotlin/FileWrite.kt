import java.io.FileWriter

fun main(args: Array<String>) {
    print("Write something: ")
     val text: String = readLine().toString()
    writeToFile(text)
}

fun writeToFile(str: String){
    try{
        val text = FileWriter("createdfile.txt",true)
        text.write(str + "\n")
        text.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}