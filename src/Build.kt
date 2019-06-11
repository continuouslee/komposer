import kubikl.komposer.Builder

val name = "Lee"

fun main() {
    val builder = with(Builder(), { build(name) })
    println(message = "Hello $builder!")
}