package montenegro.erick.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class EditDoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_doc);
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
            case R.id.item_edit_title:
                Intent intent_Change_title = new Intent(this, EditTextActivity.class);
                intent_Change_title.putExtra("text", R.id.title_label);
                startActivityForResult(intent_Change_title, 1);

                break;

            case R.id.item_edit_text:
                Intent intent_Change_text = new Intent(this, EditTextActivity.class);
                intent_Change_text.putExtra("text", R.id.text_label);
                startActivityForResult(intent_Change_text, 1);

                break;
        }
        return true;
    }
}
