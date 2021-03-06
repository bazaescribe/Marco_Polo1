package com.example.joseluisrosasbaza.marco_polo1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne = (Button)findViewById(R.id.buttonExplore);
        btnOne.setOnClickListener(this);

        Button btnTwo = (Button)findViewById(R.id.buttonViewCards);
        btnTwo.setOnClickListener(this);

        Button btnThree = (Button)findViewById(R.id.buttonJugar);
        btnThree.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View viewClicked) {
        int idView = viewClicked.getId();

        switch (idView){
            case R.id.buttonExplore:
                Log.d(LOG_TAG,"Explorar mapa");
                Intent intent = new Intent(this, MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonViewCards:
                Log.d(LOG_TAG,"Ver cartas recolectadas");
                Intent intent1 = new Intent(this, DeckActvity.class);
                startActivity(intent1);
                break;
            case R.id.buttonJugar:
                Log.d(LOG_TAG,"Ver cartas recolectadas");
                Intent intent2 = new Intent(this, PlayActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
