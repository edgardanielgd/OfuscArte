# SMITH (Simple Math Interpreter for Teaching and Humans)
SMITH es un lenguaje de programación diseñado para abordar tareas matemáticas básicas de manera sencilla. Aunque su sintaxis puede ser diferente a la de otros lenguajes más convencionales, se centra en brindar a los usuarios una forma intuitiva de trabajar con expresiones matemáticas.

En SMITH, puedes realizar operaciones aritméticas como suma, resta, multiplicación y división utilizando los operadores correspondientes (+, -, *, /). Además, puedes utilizar paréntesis para agrupar partes de una expresión y establecer la prioridad de las operaciones.

Aunque SMITH se enfoca en las matemáticas básicas, también proporciona funciones probabilisticas incorporadas que puedes utilizar en tus expresiones. Estas funciones incluyen, por ejemplo, dNorm (funcion de densidad de la normal), pNorm (funcion de distribución de la normal), rNorm (numeros aleatorios con distribucion normal), qNorm (cuantiles de la normal), entre otras. Estas funciones te permiten realizar cálculos más avanzados y aprovechar capacidades adicionales en tus expresiones matemáticas. Es posible graficar y operar con arreglos bidimensionales (matrices). Tiene las clasicas estructuras de un lenguaje de programción como lo son los condicionales, las estructuras ciclicas y funciones.

A pesar de su sintaxis peculiar, SMITH busca ser accesible para personas novatas en programación y matemáticas. A medida que te familiarices con su sintaxis y características, podrás utilizarlo para resolver problemas matemáticos básicos y realizar cálculos de manera más eficiente.

Recuerda que, aunque SMITH es una herramienta útil para tareas matemáticas básicas, si necesitas realizar cálculos más avanzados o trabajar con conceptos matemáticos complejos, es posible que debas explorar otros lenguajes de programación más especializados o utilizar software específico para matemáticas.

## Instalación
Descargar 
## Compilación
????
## Sintaxis
### Operaciones aritméticas
En SMITH, puedes realizar operaciones aritméticas básicas utilizando los operadores correspondientes. Por ejemplo, puedes sumar dos números utilizando el operador +:

```
> 1 + 2
3
```

También puedes realizar operaciones más complejas, como multiplicar dos números y sumar el resultado con otro número:

```
> 1 + 2 * 3
7
```

En este caso, la multiplicación se realiza primero, ya que tiene una prioridad mayor que la suma. Si deseas cambiar el orden de las operaciones, puedes utilizar paréntesis para agrupar partes de la expresión:

```
> (1 + 2) * 3
9
```

### Funciones probabilísticas

Algunas de las funciones probabilisticas implementadas se muestran a continuación:

```
> dNorm(0, 0, 1)
0.3989422804014327
> pNorm(0, 0, 1)
0.5
> rNorm(0, 1)
-0.04493374967306649
> qNorm(0.5, 0, 1)
0.0
```

## Créditos
SMITH fue desarrollado por:
- [Edgar Daniel Gonzalez Diaz](edgonzalezdi@unal.edu.co)
- [Jhonatan Steven Rodriguez Ibañez](jhrodriguezi@unal.edu.co)
- [Miguel Angel Puentes Cespedes](mipuentesc@unal.edu.co)
