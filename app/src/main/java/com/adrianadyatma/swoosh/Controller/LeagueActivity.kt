package com.adrianadyatma.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adrianadyatma.swoosh.Utilities.EXTRA_LEAGUE
import com.adrianadyatma.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity(), View.OnClickListener {

    lateinit var selectedLeague: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        button2.setOnClickListener {
//            val i = Intent(this, SkillActivity::class.java)
//            startActivity(i)
//        }

        tb_women.setOnClickListener(this)
        tb_men.setOnClickListener(this)
        tb_coed.setOnClickListener(this)
        btn_goSkill.setOnClickListener(this)

    }

//    fun goToSkillActivity(v: View?){
//        val i = Intent(this, SkillActivity::class.java)
//        startActivity(i)
//    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tb_women -> {
                tb_men.isChecked = false
                tb_coed.isChecked = false
                selectedLeague = "women"
            }
            R.id.tb_men -> {
                tb_women.isChecked = false
                tb_coed.isChecked = false
                selectedLeague = "men"
            }
            R.id.tb_coed -> {
                tb_women.isChecked = false
                tb_men.isChecked = false
                selectedLeague = "co-ed"
            }
            R.id.btn_goSkill -> {
                if ((tb_women.isChecked || tb_men.isChecked || tb_coed.isChecked) && this::selectedLeague.isInitialized){
                    val i = Intent(this, SkillActivity::class.java)
                    i.putExtra(EXTRA_LEAGUE, selectedLeague)
                    startActivity(i)
                } else {
                    Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
