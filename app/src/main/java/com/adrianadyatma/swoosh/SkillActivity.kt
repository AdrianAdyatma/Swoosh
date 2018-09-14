package com.adrianadyatma.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    lateinit var selectedLeague: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this, selectedLeague, Toast.LENGTH_SHORT).show()
    }
}
