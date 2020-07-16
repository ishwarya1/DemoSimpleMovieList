package sg.edu.rp.soi.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    ArrayList<String> movieList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewMovie);
        movieList = new ArrayList<>();
        movieList.add("Avengers Infinity Way Release Date: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,movieList);
        lvExamTips.setAdapter(adapter);
    }
}
