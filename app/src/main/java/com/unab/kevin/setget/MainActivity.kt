package com.unab.kevin.setget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Aqui es donde llamamos a las funciones que estan en otras clases
        //al llamarlas aca hace que se puedan ejecutar


       //empleado()
        automovil()


    }


    fun empleado()
    {
        var e1=Empleado()
        e1.edad=19
        println("La edad de la empleada es: "+e1.edad)
        e1.nombre="Laura"
        println("El nombre de nuestra empleada es: "+e1.nombre)
    }



    fun automovil()
    {
        var toyota: Automovil = Automovil("Toyota","Negro",4000)
        println("El auto que tienes es un: "+toyota.marca)
        println("El color del auto es: " +toyota.color)
        println("El percio del auto es de $" +toyota.precio)
        toyota.apagar()

        //Agregamos esto posterior de haber agregado los het y set de la variable
        toyota.velocidadMax = 120


        //Aca solo lo hacemos para poner el estado el vehiculo claro que lo llamamos de la clase
        var honda: Automovil = Automovil("honda", "gris",5000)
        honda.encender()


    }

}