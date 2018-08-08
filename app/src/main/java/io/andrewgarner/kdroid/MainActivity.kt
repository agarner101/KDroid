package io.andrewgarner.kdroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import io.andrewgarner.kdroid.time.TimeActivityIntent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.time_button).setOnClickListener({ openTime() })
    }

    private fun openTime() {
        //startActivity(TimeActivity.newIntent(this, "Hello"))

        startActivity(TimeActivityIntent("Hello"))
    }
}
