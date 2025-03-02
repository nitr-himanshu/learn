fun main() {
    val immutableBool: Boolean = true
    println(immutableBool)
//    immutableBool = false    // Error

    var mutableBool: Boolean = true
    println(mutableBool)
    mutableBool = false
    println(mutableBool)

    var typeInferBool = true
    println(typeInferBool)
}