package fausto.app.com.t_actionbar4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar1)
        val actionBar = supportActionBar
        actionBar!!.title = "Main"


        button.setOnClickListener {
            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
