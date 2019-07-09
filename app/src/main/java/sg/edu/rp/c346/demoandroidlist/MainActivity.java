package sg.edu.rp.c346.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAndroidList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);

        // Init ArrayList //
        alAndroidList = new ArrayList<AndroidVersion>();

        // Create AndroidVersion objects //
        AndroidVersion avObject0 = new AndroidVersion("Pie", "9.0");
        AndroidVersion avObject1 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion avObject2 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        // Add AndroidVersion objects to ArrayList //
        alAndroidList.add(avObject0);
        alAndroidList.add(avObject1);
        alAndroidList.add(avObject2);

        // ArrayAdapter //
        //ArrayAdapter<AndroidVersion> adapter = new ArrayAdapter<AndroidVersion>(this, android.R.layout.simple_list_item_1, alAndroidList);

        // CustomAdapter //
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, alAndroidList);

        // Set lv adapter //
        lv.setAdapter(adapter);

    }
}
