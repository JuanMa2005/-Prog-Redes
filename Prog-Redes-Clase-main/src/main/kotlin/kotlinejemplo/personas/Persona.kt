package kotlinejemplo.personas

open class Persona(
    private var nombre: String,
    private var apellido: String,
    private var edad: Int
) {

    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    fun getNombre(): String {
        return this.nombre
    }

    fun setApellido(apellido: String) {
        this.apellido = apellido
    }

    fun getApellido(): String {
        return this.apellido
    }

    fun setEdad(number: Int) {
        this.edad = number
    }

    fun getEdad(): Int {
        return this.edad
    }

    fun saludar() : String {
        return "Hola soy $nombre $apellido y tengo $edad años."
    }
}