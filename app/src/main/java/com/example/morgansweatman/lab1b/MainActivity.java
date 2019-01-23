package com.example.morgansweatman.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mysteryHelper = new ArrayList<String>();
    private Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void helpButtonClicked(View v) {
        TextView t = (TextView) findViewById(R.id.outputLabel);
        if(mysteryHelper.isEmpty()){
            populateMysteryArray();
        }
        // using size of mysteryHelper array as the upper bound for rand.nextInt()
        int randomIndex = rand.nextInt(mysteryHelper.size());
        t.setText(mysteryHelper.get(randomIndex));
        mysteryHelper.remove(randomIndex);
    }

    public void populateMysteryArray() {
        mysteryHelper.add("you get knocked out");
        mysteryHelper.add("you go somewhere else");
        mysteryHelper.add("you find a dead man");
        mysteryHelper.add("you find a dead woman");
        mysteryHelper.add("you meet a buxom blonde");
        mysteryHelper.add("someone has searched the place");
        mysteryHelper.add("a crooked cop warns you");
        mysteryHelper.add("you are arrested");
        mysteryHelper.add("you find a gun");
        mysteryHelper.add("you find a knife");
        mysteryHelper.add("you find a frayed rope");
        mysteryHelper.add("a bullet whizzes past your ear!");
        mysteryHelper.add("you are almost run over");
        mysteryHelper.add("you are being followed");
        mysteryHelper.add("you smell a familiar perfume");
        mysteryHelper.add("the telephone rings");
        mysteryHelper.add("there is a knock at the door");
        mysteryHelper.add("you hear footsteps behind you ...");
        mysteryHelper.add("you hear a gunshot!");
        mysteryHelper.add("you hear a scream!");
        mysteryHelper.add("you are not alone ...");
        mysteryHelper.add("... forget this story, it stinks!");
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
}
