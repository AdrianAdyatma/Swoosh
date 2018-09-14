package com.adrianadyatma.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        button2.setOnClickListener {
//            val i = Intent(this, SkillActivity::class.java)
//            startActivity(i)
//        }
    }

    fun goToSkillActivity(view: View){

        val i = Intent(this, SkillActivity::class.java)
        startActivity(i)
    }
}
