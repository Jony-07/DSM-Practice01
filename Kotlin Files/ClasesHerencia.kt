import java.time.LocalDate
import java.time.Period
import  java.time.format.DateTimeFormatter

open class Persona(
    var nombre: String,
    var apellidos: String,
    var direccion: String,
    var telefono: String?,
    var fechaNacimientoTexto:String
){
    var fechaNacimientoDate: LocalDate = LocalDate.parse(fechaNacimientoTexto, DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun obtenerEdad():Int{
        return Period.between(fechaNacimientoDate, LocalDate.now()).years
    }

    fun obtenerNombre():String{
        return  nombre
    }

    fun obtenerApellidos():String{
        return apellidos
    }

    fun obtenerDireccion():String{
        return direccion
    }

    fun  obtenerFechaNacimiento():String{
        return  fechaNacimientoTexto
    }

    companion object{
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }
}
    class Empleado(
        nombre: String,
        apellidos: String,
        direccion: String,
        telefono: String?,
        fechaNacimientoTexto: String
    ) :Persona(nombre, apellidos, direccion,telefono, fechaNacimientoTexto){

    }
fun main() {
    val persona = Persona("Walter Ovidio", "Sanchez Campos", "Colonia los abedules", "00000000", "20/02/1991")
    println(persona.obtenerNombre())
    println(persona.obtenerApellidos())
    println(persona.obtenerDireccion())
    println(persona.obtenerFechaNacimiento())
    println(persona.obtenerEdad())
    val empleado = Empleado("Jaime David", "Campos Sanchez", "Colonia los  Abedules", "00000000", "20/02/1995")
    println(empleado.obtenerNombre())
    println(empleado.obtenerApellidos())
    println(empleado.obtenerDireccion())
    println(empleado.obtenerFechaNacimiento())
    println(empleado.obtenerEdad())
}

