data class  Person(var name: String, var age: Int, var about: String) {
    constructor() : this("",0,"")
}

fun writeCreatingLog(p: Person){
    println("A new person ${p.name} was created.")
}
fun main() {
    val vinicius = Person("Vinícius", 27, "Annalist Support Jr")
        .also{
            writeCreatingLog(it)
        }
}