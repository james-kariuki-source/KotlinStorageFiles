import java.io.FileReader

fun main(args: Array<String>) {
    readFromFile()
}

fun readFromFile() {
    try {
        val fileread = FileReader("createdfile.txt")
        var cha: Int?

        do {
            cha = fileread.read()
            print(cha.toChar())
        } while (cha != -1)
    } catch (ex:Exception){
        println(ex.message)
    }
}