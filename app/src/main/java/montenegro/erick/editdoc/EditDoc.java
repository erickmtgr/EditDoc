package montenegro.erick.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditDoc extends AppCompatActivity {

    private TextView title_label;
    private TextView text_label;
    private static final int EDIT_BODY = 1;
    private static final int EDIT_TITLE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_doc);

        title_label = (TextView) findViewById(R.id.title_label);
        text_label = (TextView) findViewById(R.id.text_label);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_edit_title: {
                Intent intent = new Intent(this, EditTextActivity.class);
                intent.putExtra("text", title_label.getText().toString());
                startActivityForResult(intent, EDIT_TITLE);
                break;
            }
            case R.id.item_edit_text: {
                Intent intent = new Intent(this, EditTextActivity.class);
                intent.putExtra("text", text_label.getText().toString());
                startActivityForResult(intent, EDIT_BODY);
                break;
            }
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case EDIT_TITLE:
                String title = data.getStringExtra("text");
                title_label.setText(title);
                break;

            case EDIT_BODY:
                String text = data.getStringExtra("text");
                text_label.setText(text);
                break;

        }
    }
}
