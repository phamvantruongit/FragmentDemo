package vn.com.it.truongpham.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityModel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ModelFragment.newInstance())
                .commitNow()
        }
    }

}
