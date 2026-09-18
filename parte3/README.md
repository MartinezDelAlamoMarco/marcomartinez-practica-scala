# Parte 3: Mini proyectos

[← Volver al inicio](../README.md)

El objetivo de esta parte es aplicar de forma integrada lo trabajado en los capítulos 1, 2 y 3 del material del curso (DataCamp) en dos mini proyectos, cada uno en un entorno distinto de los que preparé en la [Parte 1](../parte1/README.md).

Los dos programas usan solo los conceptos vistos hasta ahora: `val` y `var`, tipos básicos e inferencia, funciones, `Array`, `List`, `::`, `if` / `else if` / `else`, operadores relacionales y lógicos, `while`, `foreach` y la diferencia entre lo mutable y lo inmutable.

## Mini proyectos

| Parte | Entorno | Mini proyecto | Documentación | Código |
|---|---|---|---|---|
| 3.1 | Visual Studio Code + Metals + sbt | Clasificador de resultados de un torneo de Twenty-One | [parte-3-1-vscode/README.md](parte-3-1-vscode/README.md) | [torneo-twenty-one/](parte-3-1-vscode/torneo-twenty-one/) |
| 3.2 | IntelliJ IDEA + sbt | Analizador de calificaciones de un grupo | [parte-3-2-intellij/README.md](parte-3-2-intellij/README.md) | [analizador-notas/](parte-3-2-intellij/analizador-notas/) |

## Entorno común

| Herramienta | Versión |
|---|---|
| Scala | 2.12.21 |
| JDK | 17.0.2 |
| sbt | 1.12.13 (lanzador 2.0.9) |

Los dos mini proyectos son proyectos sbt independientes, con su propio `build.sbt` y su propio `project/build.properties`. La configuración de las herramientas está explicada en la [Parte 1](../parte1/README.md); aquí solo creo los proyectos y programo.

## Estructura de esta carpeta

```text
parte3/
├── README.md                          ← este archivo
├── parte-3-1-vscode/
│   ├── README.md
│   └── torneo-twenty-one/
│       ├── .gitignore
│       ├── build.sbt
│       ├── project/
│       │   └── build.properties
│       └── src/main/scala/
│           └── Main.scala
├── parte-3-2-intellij/
│   ├── README.md
│   └── analizador-notas/
│       ├── .gitignore
│       ├── build.sbt
│       ├── project/
│       │   └── build.properties
│       └── src/main/scala/
│           └── Main.scala
└── images/
    ├── p31-vscode-proyecto.png
    ├── p31-metals-doctor.png
    ├── p31-build-sbt.png
    ├── p31-main-scala-1.png
    ├── p31-main-scala-2.png
    ├── p31-sbt-compile.png
    ├── p31-sbt-run-ronda1.png
    ├── p31-sbt-run-ronda2.png
    ├── p31-sbt-run-comparacion.png
    ├── p32-intellij-proyecto.png
    ├── p32-plugin-scala.png
    ├── p32-jdk17.png
    ├── p32-build-sbt.png
    ├── p32-main-scala-1.png
    ├── p32-main-scala-2.png
    ├── p32-run-intellij.png
    ├── p32-sbt-compile.png
    ├── p32-sbt-run-listado.png
    ├── p32-sbt-run-clasificacion.png
    ├── p32-sbt-run-comparacion.png
    └── p32-sbt-run-listas.png
```

Las capturas de esta parte están en [`parte3/images/`](images/), con el prefijo `p31-` para las del mini proyecto 3.1 y `p32-` para las del 3.2. Es el mismo criterio que sigue la [Parte 2](../parte2/README.md), que también tiene su propia carpeta de capturas.
