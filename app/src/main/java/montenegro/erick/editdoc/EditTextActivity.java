package montenegro.erick.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private TextView edit_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_title);

        edit_text = (TextView) findViewById(R.id.edit_text);


        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        edit_text.setText(text);




    }


}
