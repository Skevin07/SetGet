package com.unab.kevin.setget

class Automovil(mar:String,col:String,pre:Int)  {

    //Estas son las caracteristicas de nuestro automovil
    var marca = mar
    var color = col
    var precio = pre


    //Le agregamos get y set a velocidadmax
    var velocidadMax = 0
        get() = field + 10
        set(value) {
            field = value
        }

//Estas son las funciones que tendra nuestro automovil

    fun encender()
    {
        println("El auto se ha encendido")
    }

    fun apagar()
    {
        println("El auto se ha apagado")
    }

    fun acelerar()
    {
        println("El auto esta acelerando")
    }

    fun detener()
    {
        println("El auto se esta deteniendo")
    }
}