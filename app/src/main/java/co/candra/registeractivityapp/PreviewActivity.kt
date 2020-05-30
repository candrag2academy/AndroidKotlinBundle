package co.candra.registeractivityapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    val TAG = "PreviewActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        initData()
        onClickGroup()
    }
    fun initData() {
        val bundle = intent.extras
        if (bundle != null) {
            namaPreviewEditText.setText(bundle?.getString("nama", "-"))
            alamatPreviewEditText.setText(bundle?.getString("alamat", "-"))
            photoPreviewEditText.setText(bundle?.getString("photoUrl", "-"))
        } else {
            Log.d(TAG, "No data in bundle")
        }
    }

    fun onClickGroup() {
        exitTextView.setOnClickListener(View.OnClickListener { finish() })
    }
}
