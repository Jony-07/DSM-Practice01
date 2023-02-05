fun main(args: Array<String>)
{
    var arreglo01:Array<Int> = arrayOf(1,2,3)

    println(arreglo01[0])
    println(arreglo01[1])
    println(arreglo01[2])

    var arreglo02:Array<String> = arrayOf("Kotlin","C Standar","Python","CSharp")
    println(arreglo02[0])
    println(arreglo02[1])
    println(arreglo02[2])
    println(arreglo02[3])

    var arregloCadenas = arrayOfNulls<String>(4)
    arregloCadenas[0] = "Sistemas Operativos"
    arregloCadenas[1] = "Programación Estructurada"
    arregloCadenas[2] = "Programación Orientada a Objetos"
    arregloCadenas[3] = "Desarrollo de Aplicaciones para Móviles"
    println(arregloCadenas[0])
    println(arregloCadenas[1])
    println(arregloCadenas[2])
    println(arregloCadenas[3])
}