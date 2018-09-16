package com.adrianadyatma.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adrianadyatma.swoosh.Utilities.EXTRA_LEAGUE
import com.adrianadyatma.swoosh.R
import com.adrianadyatma.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity(), View.OnClickListener {

    lateinit var selectedLeague: String
    lateinit var selectedSkill: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this, selectedLeague, Toast.LENGTH_SHORT).show()

        tb_beginner.setOnClickListener(this)
        tb_baller.setOnClickListener(this)
        btn_goFinish.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tb_beginner -> {
                tb_baller.isChecked = false
                selectedSkill = "beginner"
            }
            R.id.tb_baller -> {
                tb_beginner.isChecked = false
                selectedSkill = "baller"
            }
            R.id.btn_goFinish -> {
                if ((tb_beginner.isChecked || tb_baller.isChecked) && this::selectedSkill.isInitialized){
                    val i = Intent(this, FinishActivity::class.java)
                    i.putExtra(EXTRA_LEAGUE, selectedLeague)
                    i.putExtra(EXTRA_SKILL, selectedSkill)
                    startActivity(i)
                } else {
                    Toast.makeText(applicationContext, "Please select your skill level", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
