package kotlinejemplo;

import kotlinejemplo.personas.Persona
import kotlinejemplo.personas.Estudiante

import kotlinejemplo.animales.Animal
import kotlinejemplo.animales.Gato
import kotlinejemplo.animales.Perro

fun main(args: Array<String>) {
    val persona = Persona(
        "Cave",
        "Johnson",
        44
    )

    val profesor = Profesor(
        "Isaac",
        "Kleiner",
        38
    )

    val estudiante = Estudiante(
        "Gordon",
        "Freeman",
        27
    )

    println(persona.saludar())
    println(profesor.saludar())
    println(estudiante.saludar())

    val animal = Animal()
    val gato = Animal()
    val perro = Animal()

    animal.sonido()
    gato.sonido()
    perro.sonido()
}