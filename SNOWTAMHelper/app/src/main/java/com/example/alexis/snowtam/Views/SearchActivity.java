package com.example.alexis.snowtam.Views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alexis.snowtam.Controllers.STDecoder;
import com.example.alexis.snowtam.Models.SnowTam;
import com.example.alexis.snowtam.R;

public class SearchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button button = (Button)findViewById(R.id.buttonAdd);
        Button button2 = (Button)findViewById(R.id.buttonDelete);
        Button button3 = (Button)findViewById(R.id.buttonResearch);

        button.setOnClickListener(myListener);
        button2.setOnClickListener(myListener);
        button3.setOnClickListener(myListener);
    }

    // Implement the OnClickListener callback
    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            ListView lView = (ListView) findViewById(R.id.airportsList);
            String messErr;
            switch (v.getId()) {
                case R.id.buttonAdd:
                    EditText codeString;
                    codeString = (EditText) findViewById(R.id.airportCode);
                    int code = codeString.getText().toString().length();
                    if (code == 0) {
                        messErr = getResources().getString(R.string.ErrorCode);
                        Toast.makeText(getApplicationContext(), (CharSequence) messErr, Toast.LENGTH_LONG).show();
                    } else {

                    }
                    break;


                case R.id.buttonDelete:
                    if (!lView.isSelected()) {
                        messErr = getResources().getString(R.string.ErrorSelect);
                        Toast.makeText(getApplicationContext(), (CharSequence) messErr, Toast.LENGTH_LONG).show();
                    } else {

                    }
                    break;


                case R.id.buttonResearch:
                    if (lView.getAdapter().getCount() == 0) {
                        messErr = getResources().getString(R.string.ErrorSearch);
                        Toast.makeText(getApplicationContext(), (CharSequence) messErr, Toast.LENGTH_LONG).show();
                    } else {

                    }
                    break;

            }
        }
    };
}
