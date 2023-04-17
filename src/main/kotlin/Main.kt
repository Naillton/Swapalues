import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var a: Int
    var b: Int
    println("Digite o valor da varivael a: ")
    a = sc.nextInt()
    println("Digite o valor da variavel b: ")
    b = sc.nextInt()
    println("Os valores de a e b sao a = $a e b = $b")
    println("OOOOPPPSSSSS e agora quais sao os valores de a e b ?")
    a = b
    b = 14
    println("a = $a e b = $b")
}