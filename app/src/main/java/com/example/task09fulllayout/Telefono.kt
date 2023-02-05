package com.example.task09fulllayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task09fulllayout.databinding.ActivityMainBinding
import com.example.task09fulllayout.databinding.ActivityTelefonoBinding

class Telefono : AppCompatActivity() {
    private lateinit var binding: ActivityTelefonoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelefonoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var num = ""

        //cada numero que se pulsa aparece en el textview
        binding.num1.setOnClickListener {
            num = num + "1"
            binding.numero.text = num
        }
        binding.num2.setOnClickListener {
            num = num + "2"
            binding.numero.text = num
        }
        binding.num3.setOnClickListener {
            num = num + "3"
            binding.numero.text = num
        }
        binding.num4.setOnClickListener {
            num = num + "4"
            binding.numero.text = num
        }
        binding.num5.setOnClickListener {
            num = num + "5"
            binding.numero.text = num
        }
        binding.num6.setOnClickListener {
            num = num + "6"
            binding.numero.text = num
        }
        binding.num7.setOnClickListener {
            num = num + "7"
            binding.numero.text = num
        }
        binding.num8.setOnClickListener {
            num = num + "8"
            binding.numero.text = num
        }
        binding.num9.setOnClickListener {
            num = num + "9"
            binding.numero.text = num
        }
        binding.num0.setOnClickListener {
            num = num + "0"
            binding.numero.text = num
        }
        binding.asterisco.setOnClickListener {
            num = num + "*"
            binding.numero.text = num
        }
        binding.sharp.setOnClickListener {
            num = num + "#"
            binding.numero.text = num
        }
        binding.llamar.setOnClickListener {
            num = "Llamando..."
            binding.numero.text = num
        }

        //si pulsa el boton de borrar se borra el ultimo numero
        binding.borrar.setOnClickListener {
            if(num.equals("Llamando...")){
                num = ""
            }else
                num = num.dropLast(1)
            binding.numero.text = num
        }


    }





}