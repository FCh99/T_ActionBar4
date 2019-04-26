package fausto.app.com.t_actionbar4

import android.app.SearchManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_searchable3.*

class Searchable3Activity : AppCompatActivity() {

    var string1 = "Los dardos vuelan entre Ciudadanos y el PP tras el salto de barco a cuatro días de las elecciones del expresidente popular de la Comunidad de Madrid Ángel Garrido. Albert Rivera ha respondido a las críticas del PP por su fichaje in extremis vinculando la marcha del dirigente popular a Ciudadanos a los problemas de corrupción del PP o sus pactos con los nacionalistas en el pasado. Les recomendaría que se pregunten qué han hecho mal, ha cargado Rivera contra el PP. "

    var string2 = "Microsoft renuncia a la caducidad de las contraseñas. A partir de ahora, no exigirá su cambio periódico tras comprobar que es una medida inútil e incluso peligrosa. Esta medida pretendía evitar que una cuenta fuera pirateada, pero según reconoce Aaron Margosis, consultor principal de la compañía, su efectividad es nula. “Si una contraseña no ha sido robada no hay necesidad de cambiarla. Y si hay evidencia de que ha sido robada, hay que actuar de inmediato, sin esperar a que caduque”, explica en el blog de seguridad de la compañía "

    var string3 = "En un partido emocional, de idas y venidas, de apariciones y desapariciones, el Atlético logró estirar al menos una jornada más el desenlace de la Liga. Una derrota ante el Valencia hubiese supuesto ya el alirón del Barcelona, que ahora debe ganar el sábado al Levante en el Camp Nou para celebrar el título antes de medirse al Liverpool en las semifinales de la Champions."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchable3)

        setSupportActionBar(toolbar1)
        var actionBar = supportActionBar

       actionBar!!.title = "Searchable3Activity"
        actionBar!!.setDisplayHomeAsUpEnabled(true)



        handleIntent(intent)


    }

    override fun onNewIntent(intent: Intent?) {
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        if (Intent.ACTION_SEARCH == intent!!.action) {
            val query = intent!!.getStringExtra(SearchManager.QUERY)
            doMySearch(query)
        }
    }

    // use the query to search your data
    private fun doMySearch(query: String?) {
        println("--- query in Searchable3Activity ---> $query")
        resultsTv.text = query
    }
}
