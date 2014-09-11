package at.wada811.applicationandmavenrepository;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import at.wada811.android.dialogfragments.AlertDialogFragment;


public class MyActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        if(savedInstanceState == null){
            new AlertDialogFragment.Builder(this).setTitle("Hello, Maven repository!").setMessage(
                "You can use Android-DialogFragments (GitHub repository) as Maven repository."
            ).show(getSupportFragmentManager(), AlertDialogFragment.TAG);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
