package co.candra.registeractivityapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickGroup()
    }


    fun onClickGroup() {
        submitTextView.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PreviewActivity::class.java)
            val bundle = Bundle()
            bundle.putString("nama", namaEditText.getText().toString())
            bundle.putString("alamat", alamatEditText.getText().toString())
            bundle.putString("photoUrl", photoEditText.getText().toString())
            intent.putExtras(bundle)
            startActivity(intent)
            //finish()
        })
    }
}
