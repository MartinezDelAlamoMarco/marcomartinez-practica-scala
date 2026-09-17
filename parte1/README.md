# Parte 1: Entornos de trabajo

[← Volver al inicio](../README.md)

El objetivo de esta parte es preparar tres entornos capaces de ejecutar código **Scala 2.12.21**. Serán la base de las Partes 2 y 3 de la práctica.

```text
JupyterLab
    └── Almond Kernel
            └── Scala 2.12.21

Visual Studio Code
    ├── Metals
    ├── JDK 17
    └── sbt
         └── Scala 2.12.21

IntelliJ IDEA (antes Community)
    ├── Scala Plugin
    ├── JDK 17
    └── sbt
         └── Scala 2.12.21
```

## Documentación de cada entorno

| Entorno | Herramientas | Documentación | Código |
|---|---|---|---|
| 1 | JupyterLab + Almond Kernel | [entorno1-jupyterlab.md](entorno1-jupyterlab.md) | [notebook/entorno-scala.ipynb](notebook/entorno-scala.ipynb) |
| 2 | Visual Studio Code + Metals + sbt | [entorno2-vscode.md](entorno2-vscode.md) | [scala-vscode/](scala-vscode/) |
| 3 | IntelliJ IDEA Community + sbt | [entorno3-intellij.md](entorno3-intellij.md) | [scala-intellij/](scala-intellij/) |

## Orden de trabajo

He configurado los entornos uno a uno (primero JupyterLab, luego VS Code y por último IntelliJ). Antes de instalar nada comprobé qué tenía ya instalado, sin desinstalar nada, solo he corregido lo que tenía una versión incorrecta o fallaba.

## Requisitos comunes

| Herramienta | Versión |
|---|---|
| Python + pip | 3.13.5 / 26.2.1 |
| JDK | 17.0.2 |
| Coursier (`cs`) | 2.1.25-M26 |
| sbt | Lanzador 2.0.9, proyectos con 1.12.13 |
| Visual Studio Code + Metals | 1.138.0 / 1.71.0 |
| IntelliJ IDEA + plugin Scala | 2026.2.3 / 2026.2.19 |

## Estructura de esta carpeta

```text
parte1/
├── README.md                  ← este archivo
├── entorno1-jupyterlab.md
├── entorno2-vscode.md
├── entorno3-intellij.md
├── notebook/
│   └── entorno-scala.ipynb
├── scala-vscode/
│   ├── .gitignore
│   ├── build.sbt
│   ├── project/
│   │   └── build.properties
│   └── src/main/scala/
│       └── Main.scala
└── scala-intellij/
    ├── .gitignore
    ├── build.sbt
    ├── project/
    │   └── build.properties
    └── src/main/scala/
        └── Main.scala
```

Las capturas de pantalla están en la carpeta [`images/`](../images/) de la raíz del repositorio.

## Nota sobre el enunciado

- **IntelliJ IDEA Community.** IntelliJ IDEA Community y Ultimate ya no se encuentran por separado: JetBrains unió Community y Ultimate en un único IDE, cuyas funciones básicas son gratuitas. Uso IntelliJ IDEA 2026.2.3 en modo gratuito.
- **Estructura de carpetas.** Los proyectos están en `parte1/scala-vscode` y `parte1/scala-intellij`.

## Problemas encontrados

| Entorno | Problema | Estado |
|---|---|---|
| 1 | `jupyter` no se reconocía como comando (carpeta `Scripts` fuera del `PATH`) | Resuelto |
| 1 | Java 26 activo en vez de Java 17 | Resuelto (`JAVA_HOME` y orden del `PATH`) |
| 1 | No aparecía Scala en JupyterLab (`cs setup` no instala Almond) | Resuelto (`cs launch almond`) |
| 2 y 3 | Tildes mal en `sbt run` por la codificación de la consola de Windows | No corregido; solución: cambiar codificación de la consola |
| 3 | `ClassNotFoundException: Main` al ejecutar desde IntelliJ | Resuelto (proyecto recreado con sbt 1.12.13) |
