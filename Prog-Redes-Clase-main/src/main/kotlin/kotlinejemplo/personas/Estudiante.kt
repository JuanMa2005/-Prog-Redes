package kotlinejemplo.personas

class Estudiante(
    private var nombre: String,
    private var apellido: String,
    private var edad: Int
) :
    Persona(nombre, apellido, edad)
{

}