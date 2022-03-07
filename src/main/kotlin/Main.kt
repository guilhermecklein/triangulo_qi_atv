fun main() {val triangulo = triangulo()}


    fun triangulo(): Unit {
        println("Digite o primeiro lado do triangulo:")
        val n1 = readLine()!!.toFloat()
        println("Digite o segundo lado do triagunlo")
        val n2 = readLine()!!.toFloat()
        println("Digite o terceiro lado do triangulo:")
        val n3 = readLine()!!.toFloat()

        if (n1 == n2 && n2 == n3) {
            println("Seu triangulo é Equilatero pois possui tres lados iguais")
        } else if (n1 != n2 && n2 != n3 && n1 != n3) {
            println("Seu triangulo é escaleno pois possui três lados diferentes")
        } else {
            println("Seu triangulo é Isósceles pois possui um lado diferente dos demais")
        }
    }


