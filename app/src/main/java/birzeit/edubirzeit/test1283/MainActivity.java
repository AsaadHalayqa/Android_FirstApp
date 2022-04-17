package birzeit.edubirzeit.test1283;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtPL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtPL = findViewById(R.id.edtPL);
    }

    public void btnSubmit_OnClick(View view) {
        String str = "";

        str = edtName.getText().toString() + "\n";
        str += edtPL.getText().toString();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}