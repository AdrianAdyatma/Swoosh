package com.adrianadyatma.swoosh.Controller

import android.os.Bundle
import com.adrianadyatma.swoosh.Model.Player
import com.adrianadyatma.swoosh.R
import com.adrianadyatma.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        tv_loading.text = "Looking for ${player.league} league with ${player.skill} skill"
    }

}
