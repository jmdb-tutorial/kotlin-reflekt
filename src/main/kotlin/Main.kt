class A(val p: Int)

/**
 * https://kotlinlang.org/docs/reference/reflection.html
 * https://www.javacodegeeks.com/2014/04/constructormethod-parameters-metadata-available-via-reflection-in-jdk-8.html
 */
fun main(args:Array<String>) {
    val o = TestJavaClass("foo", "bar")

    val constructors = o.javaClass.kotlin.constructors

    println("Number of ctors: " + constructors.size)

    val firstConstructor = constructors.first()

    val parameters = firstConstructor.parameters

    println(parameters.get(0).name)
    println(parameters.get(1).name)
}
