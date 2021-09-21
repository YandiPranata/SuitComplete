import elements.Paper
import elements.Rock
import elements.Scissors
import elements.parent.Suit
import helper.StringContainer

fun main(args: Array<String>) {
    startSuit()
}

/*Challenge Suit*/
private fun startSuit() {
    println(
        """terminal:~terminal$
        |==========================
        |GAME SUIT TERMINAL VERSION
        |==========================
    """.trimMargin()
    )
    println("1. Masukkan Pemain 1: ")
    val input1 = readLine()
    val suit1 = when (input1) {
        "gunting" -> Scissors(StringContainer.scissors)
        "batu" -> Rock(StringContainer.rock)
        "kertas" -> Paper(StringContainer.paper)
        else -> Suit("nothing else")
    }

    if (suit1.name != "nothing else") {
        println("2. Masukkan Pemain 2: ")
        val input2 = readLine()
        val suit2 = when (input2) {
            "gunting" -> Scissors(StringContainer.scissors)
            "batu" -> Rock(StringContainer.rock)
            "kertas" -> Paper(StringContainer.paper)
            else -> Suit("nothing else")
        }

        if (suit2.name != "nothing else") {

            val result = suit1.actionAgainst(suit2)
            println("""
                 
                Hasil
                ${result.status}""".trimIndent())
        } else {
            println("silahkan input kembali")
            startSuit()
        }

    }
}