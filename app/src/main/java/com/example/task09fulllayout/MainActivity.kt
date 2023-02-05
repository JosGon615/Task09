package com.example.task09fulllayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task09fulllayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //al pulsar el layout CallP se abre la actividad de telefono
        binding.constraintCallP.setOnClickListener {
            var intent = Intent(this, Telefono::class.java)
            startActivity(intent)
        }

        //al pulsar el layout NavigateP se abre la actividad de mapa
        binding.ConstraintNavigateP.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:"))
            startActivity(intent)
        }

        //al pulsar el contraintPlayP se abre la app play store del movil usando uri
        binding.ConstraintPlayP.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"))
            startActivity(intent)
        }

        //al pulsar el layout ConstraintMusica se abre la web de spotify usando uri
           binding.ConstraintMusica.setOnClickListener {
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/"))
                startActivity(intent)
            }

        //al pulsar el layout ConstraintLlamada se abre la web de discord usando uri
        binding.ConstaintLlamada.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.com/"))
            startActivity(intent)
        }

        //al pulsar el layout ConstraintGPS se abre la direccion maps usando uri
        binding.ConstraintGPS.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.416775, -3.703790"))
            startActivity(intent)
        }


    }
}
