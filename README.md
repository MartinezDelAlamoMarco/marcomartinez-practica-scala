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
└── images/
    ├── jupyter-*.png
    ├── vscode-*.png
    └── intellij-*.png
```

- **`parte1/`**: documentación en Markdown, notebook y proyectos de cada entorno.
- **`images/`**: capturas de pantalla referenciadas desde los archivos Markdown.

## Cómo navegar

1. Empieza por la [Parte 1](parte1/README.md): resume los tres entornos, los requisitos comunes y los problemas encontrados.
2. Cada entorno tiene su propio documento con los pasos en orden, una captura por paso y un resumen final.
3. El código está junto a la documentación: el notebook en `parte1/notebook/` y los proyectos sbt en `parte1/scala-vscode/` y `parte1/scala-intellij/`.
