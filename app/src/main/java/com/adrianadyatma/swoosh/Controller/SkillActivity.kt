package com.adrianadyatma.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adrianadyatma.swoosh.Model.Player
import com.adrianadyatma.swoosh.R
import com.adrianadyatma.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity(), View.OnClickListener {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Toast.makeText(this, player.league, Toast.LENGTH_SHORT).show()

        tb_beginner.setOnClickListener(this)
        tb_baller.setOnClickListener(this)
        btn_goFinish.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tb_beginner -> {
                tb_baller.isChecked = false
                player.skill = "beginner"
            }
            R.id.tb_baller -> {
                tb_beginner.isChecked = false
                player.skill = "baller"
            }
            R.id.btn_goFinish -> {
                if ((tb_beginner.isChecked || tb_baller.isChecked) && !(player.skill).isEmpty()){
                    val i = Intent(this, FinishActivity::class.java)
                    i.putExtra(EXTRA_PLAYER, player)
                    startActivity(i)
                } else {
                    Toast.makeText(applicationContext, "Please select your skill level", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
