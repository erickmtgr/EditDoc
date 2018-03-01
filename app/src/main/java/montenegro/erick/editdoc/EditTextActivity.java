package montenegro.erick.editdoc;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_content);

        edit_text = (EditText) findViewById(R.id.edit_text);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        edit_text.setText(text);
    }

    public void onSave(View view) {
        Intent data = new Intent();
        data.putExtra("text", edit_text.getText().toString());
        setResult(RESULT_OK, data);
        //startActivityForResult(data, EDIT_TITLE);
        finish();
    }
}
