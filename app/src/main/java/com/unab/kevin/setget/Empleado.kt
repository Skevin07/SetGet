package com.unab.kevin.setget

class Empleado{


    var edad = 0
        get() = field
        set(value) {
            if(value>=18 && value<=80){
                field = value
                println("Tienes la edad para trabajar")
            }else if(value<18){
                println("Todavia no tienes la edad para trabajar")
            }else{
                println("Eres demaciado viejo para trabajar")
            }
        }

    var nombre:String?=null
        get() = field?.toUpperCase()
        set(value) {
            if(value!!.isEmpty()) {
                println("El nombre debe de tener texto")
            }else{
                field = value

            }
        }



}