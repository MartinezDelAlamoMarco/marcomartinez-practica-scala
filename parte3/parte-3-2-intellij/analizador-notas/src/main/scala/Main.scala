object Main extends App {
    val estudiantes = List("Ana", "Luis", "Marta", "Pedro", "Sofia")

    val notas = Array(8, 4, 10, 6, 3)

    val notasSegundaEvaluacion = Array(9, 5, 8, 7, 6)

    def aprobado(nota: Int): Boolean = {
      if (nota >= 5) true
      else false
    }

    def estadoNota(nota: Int): String = {
      if (aprobado(nota)) "APROBADO"
      else "SUSPENSO"
    }

    def maxNota(a: Int, b: Int): Int = {
      if (a > b) a
      else b
    }

    def clasificacion(nota: Int): String = {
      if (nota >= 9) "EXCELENTE"
      else if (nota >= 7) "NOTABLE"
      else if (nota >= 5) "APROBADO"
      else "SUSPENSO"
    }

    def notaMasAlta(listaNotas: Array[Int]): Int = {
      var mejor = listaNotas(0)
      var posicion = 1
      while (posicion < listaNotas.length) {
        mejor = maxNota(mejor, listaNotas(posicion))
        posicion += 1
      }
      mejor
    }

    def mostrarEvaluacion(nombres: List[String], listaNotas: Array[Int]): Unit = {
      var posicion = 0
      while (posicion < listaNotas.length) {
        println(s"${nombres(posicion)} -> ${listaNotas(posicion)} -> ${estadoNota(listaNotas(posicion))}")
        posicion += 1
      }
    }

    def mostrarClasificacion(nombres: List[String], listaNotas: Array[Int]): Unit = {
      var posicion = 0
      while (posicion < listaNotas.length) {
        println(s"${nombres(posicion)} -> ${listaNotas(posicion)} -> ${clasificacion(listaNotas(posicion))}")
        posicion += 1
      }
    }

    def compararEvaluaciones(aprobadosPrimera: Int, aprobadosSegunda: Int): String = {
      if (aprobadosSegunda > aprobadosPrimera) "El grupo ha mejorado"
      else if (aprobadosSegunda < aprobadosPrimera) "El grupo ha empeorado"
      else "El grupo se ha mantenido igual"
    }

    var i = 0
    while (i < notas.length) {
      println(s"${estudiantes(i)} -> ${notas(i)} -> ${estadoNota(notas(i))}")
      i += 1
    }

    val totalEstudiantes = estudiantes.length
    val aprobadosPrimera = notas.count(aprobado)
    val suspensosPrimera = notas.count(!aprobado(_))
    val mejorNotaPrimera = notaMasAlta(notas)

    println("\n--- Resumen del grupo ---")
    println(s"Estudiantes: $totalEstudiantes")
    println(s"Aprobados: $aprobadosPrimera")
    println(s"Suspensos: $suspensosPrimera")
    println(s"Mejor nota: $mejorNotaPrimera")

    println("\n--- Clasificación de la primera evaluación ---")
    mostrarClasificacion(estudiantes, notas)

    println("\n--- Segunda evaluación ---")
    mostrarEvaluacion(estudiantes, notasSegundaEvaluacion)

    val aprobadosSegunda = notasSegundaEvaluacion.count(aprobado)
    val suspensosSegunda = notasSegundaEvaluacion.count(!aprobado(_))
    val mejorNotaSegunda = notaMasAlta(notasSegundaEvaluacion)

    println("\n--- Resumen del grupo (segunda evaluación) ---")
    println(s"Estudiantes: $totalEstudiantes")
    println(s"Aprobados: $aprobadosSegunda")
    println(s"Suspensos: $suspensosSegunda")
    println(s"Mejor nota: $mejorNotaSegunda")

    println("\n--- Clasificación de la segunda evaluación ---")
    mostrarClasificacion(estudiantes, notasSegundaEvaluacion)

    println("\n--- Comparación de las dos evaluaciones ---")
    println(s"Mejor nota de la primera evaluación: $mejorNotaPrimera")
    println(s"Mejor nota de la segunda evaluación: $mejorNotaSegunda")
    println(s"Aprobados en la primera evaluación: $aprobadosPrimera")
    println(s"Aprobados en la segunda evaluación: $aprobadosSegunda")
    println(compararEvaluaciones(aprobadosPrimera, aprobadosSegunda))

    val nuevosEstudiantes = "Carlos" :: estudiantes

    println("\n--- Lista de estudiantes ---")
    println(s"Lista original: $estudiantes")
    println(s"Lista nueva: $nuevosEstudiantes")
}
