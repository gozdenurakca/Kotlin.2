package com.gna.secondapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gna.secondapplication.ui.theme.SecondApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        // If Statements - Eğer kontrolleri

        println("------ IF STATEMENTS ------")

        val skor = 10

        if(skor < 10) {
            println("Oyunu kaybettin !")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında , çok iyi skor aldın !")
        } else if(skor >= 10 && skor < 20) {
            println("Skorun 20 ile 30 arasında, rekorlar kırıyorsun !")
        } else{
            println("Skorun 30'un üstünde efsane oynadın !")
        }

        // When - Switch

        println("------ WHEN ------")
        // else if'lerin çok fazla olmaya başladığı zaman genelde "when" kullanılır.

        var notRakami = 3
        var notStringi = ""

        if(notRakami == 0) {
            notStringi = "Geçersiz not"
        } else if(notRakami == 1) {
            notStringi = "Zayıf not"
        } else if (notRakami == 2) {
            notStringi = "Kötü not"
        } else if (notRakami == 3) {
            notStringi = "Orta not"
        } else if (notRakami == 4) {
            notStringi = "İyi not"
        } else {
            notStringi = "Pek iyi not"
        }
        println(notStringi)

        println("--")


        // when -> switch - case gibi
        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü Not"
            3 -> notStringi = "Orta Not"
            4 -> notStringi = "İyi Not"
            5 -> notStringi = "Pek iyi Not"
        }
        println(notStringi)


        // Döngüler
        // For

        println("------ For Döngüsü ------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val x = baskaBirDizi[0] / 5 + 1
        println(x) // 4


        println("Döngü başladı.")
        for(numara in baskaBirDizi) {
            println(numara)
        }
        println("Döngü bitti.")

        // herhangi bir şeyden dolayı index almamız gerekirse bu yapıyı kullanmamız mantıklıdır..
        // indices = içindeki indexleri veren bir yapı
        for(indeks in baskaBirDizi.indices) {
            println(baskaBirDizi[indeks] / 5 + 1)
        }


        // "0 .. 9" -> 0'dan 9' a kadar olan sayılardan bahseder.
        for(b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Gözde")
        benimDigerStringDizim.add("Nur")
        benimDigerStringDizim.add("Akça")

        for(str in benimDigerStringDizim) {
            println(str)
        }

        benimDigerStringDizim.forEach {
            println(it)
        }

        // WHILE

        println("------ WHILE Döngüsü ------")

        var j = 0

        while (j <= 10) {
            println(j)
            j++
        }
    }
}