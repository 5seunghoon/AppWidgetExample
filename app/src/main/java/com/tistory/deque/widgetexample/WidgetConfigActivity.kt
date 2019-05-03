package com.tistory.deque.widgetexample

import android.app.Activity
import android.appwidget.AppWidgetManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tistory.deque.widgetexample.ui.widgetconfig.WidgetConfigFragment

class WidgetConfigActivity : AppCompatActivity() {

    private var appWidgetId = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.widget_config_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, WidgetConfigFragment.newInstance())
                .commitNow()
        }

        intent.extras?.run {
            appWidgetId = getInt(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID)
        }
    }

    fun clickFragButton() {
        Log.d("LOG_TAG", "CLICK FRAG BUTTON")
        Intent().run {
            putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
            setResult(Activity.RESULT_OK, this)
        }
        finish()
    }

}
