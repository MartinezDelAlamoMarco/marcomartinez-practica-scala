object Main extends App {

    val jugadores = List(
        "Alex",
        "Chen",
        "Marta",
        "Sindhu",
        "Luis"
    )

    val puntuaciones = Array(
        18, 
        24, 
        21, 
        20, 
        26
    )

    val puntuacionesRonda2 = Array(
        22,
        19,
        20,
        21,
        17
    )

    def bust(puntuacion: Int): Boolean = {
        puntuacion > 21
    }

    def estadoMano(jugador: String, puntuacion: Int): String = {
        if (bust(puntuacion)) {
            "BUST"
        } else {
            "VALIDA"
        }
    }

    def mejorMano(handA: Int, handB: Int): Int = {
        if (bust(handA) && bust(handB)) {
            0
        } else if (bust(handA)) {
            handB
        } else if (bust(handB)) {
            handA
        } else {
            Math.max(handA, handB)
        }
    }

    def mostrarRondaConForeach(nombres: List[String], puntos: Array[Int]): Unit = {
        var posicion = 0
        puntos.foreach { puntuacion =>
            val jugador = nombres(posicion)
            println(s"$jugador -> $puntuacion -> ${estadoMano(jugador, puntuacion)}")
            posicion += 1
        }
    }

    def compararRondas(mejorRonda1: Int, mejorRonda2: Int): String = {
        if (mejorRonda1 == mejorRonda2) {
            "Las dos rondas tienen la misma mejor puntuación válida"
        } else if (mejorMano(mejorRonda1, mejorRonda2) == mejorRonda1) {
            "La mejor puntuación válida es la de la ronda 1"
        } else {
            "La mejor puntuación válida es la de la ronda 2"
        }
    }

    var i = 0
    while (i < jugadores.length) {
    val jugador = jugadores(i)
    val puntuacion = puntuaciones(i)
    println(s"$jugador -> $puntuacion -> ${estadoMano(jugador, puntuacion)}")
    i += 1
    }

    println("\n--- Resumen de la ronda 1 ---")
    val totalJugadores = jugadores.length
    println(s"Total de jugadores: $totalJugadores")

    val manosValidas = puntuaciones.count(!bust(_))
    println(s"Manos válidas: $manosValidas")

    val manosPasadas = puntuaciones.count(bust)
    println(s"Bust: $manosPasadas")

    val mejorPuntuacionValida = puntuaciones.filter(!bust(_)).max
    println(s"Mejor puntuación válida: $mejorPuntuacionValida")

    println("\n--- Ronda 2 (mismo recorrido con foreach) ---")
    mostrarRondaConForeach(jugadores, puntuacionesRonda2)

    println("\n--- Resumen de la ronda 2 ---")
    val totalJugadoresRonda2 = jugadores.length
    println(s"Total de jugadores: $totalJugadoresRonda2")

    val manosValidasRonda2 = puntuacionesRonda2.count(!bust(_))
    println(s"Manos válidas: $manosValidasRonda2")

    val manosPasadasRonda2 = puntuacionesRonda2.count(bust)
    println(s"Bust: $manosPasadasRonda2")

    val mejorPuntuacionValidaRonda2 = puntuacionesRonda2.filter(!bust(_)).max
    println(s"Mejor puntuación válida: $mejorPuntuacionValidaRonda2")
    println("\n--- Comparación de las dos rondas ---")
    println(s"Mejor puntuación válida de la ronda 1: $mejorPuntuacionValida")
    println(s"Mejor puntuación válida de la ronda 2: $mejorPuntuacionValidaRonda2")
    println(compararRondas(mejorPuntuacionValida, mejorPuntuacionValidaRonda2))
}
