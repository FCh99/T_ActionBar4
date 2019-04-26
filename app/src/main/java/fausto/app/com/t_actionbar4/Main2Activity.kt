package fausto.app.com.t_actionbar4

import android.app.SearchManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setSupportActionBar(toolbar2)
        val actionBar = supportActionBar
        actionBar!!.title = "Main2"

        actionBar.setDisplayHomeAsUpEnabled(true)



    }

    override fun onSearchRequested(): Boolean {
        return super.onSearchRequested()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.top_menu, menu)

        // Assiciate serachable configuration with SearchView
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager

        val menuItem = menu!!.findItem(R.id.action_search)
        val searchView = menuItem.actionView as SearchView

        searchView.isSubmitButtonEnabled = true

        searchView.apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }


        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?) = when(item!!.itemId) {
        R.id.action_noticias -> {
            println("----> elegido noticias")
            true
        }
        R.id.action_eventos -> {
            println("----> elegido Eventos")
            true
        }

        R.id.action_trabajos -> {
            println("----> elegido Trabajos")
            true
        }

        else -> super.onOptionsItemSelected(item)

    }
}
