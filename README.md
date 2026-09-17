# Práctica de programación básica con Scala

## Autor

Nombre y apellidos: Marco Martínez del Álamo

## Entorno

- Sistema operativo: Windows 11
- Scala: 2.12.21
- Java: JDK 17 (17.0.2)
- sbt: 1.12.13 (proyectos)
- IDE: JupyterLab 4.6.3 · Visual Studio Code 1.138.0 · IntelliJ IDEA 2026.2.3

## Parte 1 - Entornos de trabajo

Preparación de tres entornos capaces de ejecutar Scala 2.12.21, documentados paso a paso con capturas de pantalla.

[Ver documentación de la Parte 1](parte1/README.md)

### Entorno 1

JupyterLab + Almond Kernel

- [Documentación](parte1/entorno1-jupyterlab.md)
- [Notebook `entorno-scala.ipynb`](parte1/notebook/entorno-scala.ipynb)

### Entorno 2

Visual Studio Code + Metals + sbt

- [Documentación](parte1/entorno2-vscode.md)
- [Proyecto `scala-vscode`](parte1/scala-vscode/)

### Entorno 3

IntelliJ IDEA Community + sbt

- [Documentación](parte1/entorno3-intellij.md)
- [Proyecto `scala-intellij`](parte1/scala-intellij/)

> IntelliJ IDEA Community y Ultimate ya no se encuentran por separado. Uso IntelliJ IDEA 2026.2.3 en su modo gratuito, que es el equivalente actual ([ver nota](parte1/entorno3-intellij.md#nota-intellij-idea-community-edition-ya-no-se-distribuye-por-separado)).

## Parte 2 - Programación con Scala

15 ejercicios de programación resueltos en JupyterLab con Almond Kernel y Scala 2.12.21, basados en los capítulos 1, 2 y 3 del material del curso (DataCamp).

[Ver documentación de la Parte 2](parte2/README.md)

| Notebook | Ejercicios |
|---|---|
| [ejercicios-01-05.ipynb](parte2/notebooks/ejercicios-01-05.ipynb) | 1 a 5 |
| [ejercicios-06-10.ipynb](parte2/notebooks/ejercicios-06-10.ipynb) | 6 a 10 |
| [ejercicios-11-15.ipynb](parte2/notebooks/ejercicios-11-15.ipynb) | 11 a 15 |

## Estructura del repositorio

```text
marcomartinez-practica-scala/
├── README.md
├── parte1/
│   ├── README.md
│   ├── entorno1-jupyterlab.md
│   ├── entorno2-vscode.md
│   ├── entorno3-intellij.md
│   ├── notebook/
│   │   └── entorno-scala.ipynb
│   ├── scala-vscode/
│   └── scala-intellij/
├── parte2/
│   ├── README.md
│   ├── notebooks/
│   │   ├── ejercicios-01-05.ipynb
│   │   ├── ejercicios-06-10.ipynb
│   │   └── ejercicios-11-15.ipynb
│   └── images/
│       └── parte2-*.png
└── images/
    ├── jupyter-*.png
    ├── vscode-*.png
    └── intellij-*.png
```

- **`parte1/`**: documentación en Markdown, notebook y proyectos de cada entorno.
- **`parte2/`**: notebooks con los 15 ejercicios y sus capturas.
- **`images/`**: capturas de pantalla de la Parte 1, referenciadas desde los archivos Markdown.

## Cómo navegar

1. Empieza por la [Parte 1](parte1/README.md): resume los tres entornos, los requisitos comunes y los problemas encontrados.
2. Cada entorno tiene su propio documento con los pasos en orden, una captura por paso y un resumen final.
3. El código está junto a la documentación: el notebook en `parte1/notebook/` y los proyectos sbt en `parte1/scala-vscode/` y `parte1/scala-intellij/`.
4. Continúa con la [Parte 2](parte2/README.md): los 15 ejercicios repartidos en tres notebooks, cada uno con su explicación en Markdown y la salida de las celdas ejecutadas.
