package io.andrewgarner.kdroid.time

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import io.andrewgarner.kdroid.R

/**
 * Activity that displays time.
 * Created by andrewgarner on 8/7/18.
 */
class TimeActivity : AppCompatActivity() {

    companion object {
        private const val INTENT_DATA = "data"

        fun newIntent(context: Context, data: String): Intent {
            val intent = Intent(context, TimeActivity::class.java)
            intent.putExtra(INTENT_DATA, data)
            return intent
        }
    }

    private lateinit var mTimeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val data = intent.getStringExtra(INTENT_DATA)

        mTimeTextView = findViewById(R.id.time_text)
        mTimeTextView.text = data

        findViewById<View>(R.id.update_button).setOnClickListener { setTime() }
    }

    private fun setTime() {
        val currentTimeMillis = System.currentTimeMillis()

        mTimeTextView.text = currentTimeMillis.toString()
    }
}