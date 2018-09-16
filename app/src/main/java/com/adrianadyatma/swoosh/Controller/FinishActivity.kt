package com.adrianadyatma.swoosh.Controller

import android.os.Bundle
import android.widget.Toast
import com.adrianadyatma.swoosh.R
import com.adrianadyatma.swoosh.Utilities.EXTRA_LEAGUE
import com.adrianadyatma.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    lateinit var selectedLeague: String
    lateinit var selectedSkill: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        selectedSkill = intent.getStringExtra(EXTRA_SKILL)

        tv_loading.text = "Looking for $selectedLeague league with $selectedSkill skill"
    }

}
