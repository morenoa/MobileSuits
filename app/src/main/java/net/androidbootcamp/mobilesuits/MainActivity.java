package net.androidbootcamp.mobilesuits;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] mobileSuits = {"MS01", "MS02", "MS03", "MS04"};
        setListAdapter((new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel,
                mobileSuits)));
    }

    protected void onListItemClick(ListView i,View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, mobilesuit02.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, mobilesuit03.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, mobilesuit04.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, mobilesuit05.class));
                break;
        }
    }
}
