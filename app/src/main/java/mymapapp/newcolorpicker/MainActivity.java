package mymapapp.newcolorpicker;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static String TAG = "GrizzlyColors";

    private SeekBar redBar;
    private SeekBar greenBar;
    private SeekBar blueBar;
    private SeekBar alphaBar;
    private TextView colorV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button btnUpdate = (Button) findViewById(R.id.btnUpdate);
        redBar = (SeekBar) findViewById(R.id.redSeekBar);
        greenBar = (SeekBar) findViewById(R.id.greenSeekBar);
        blueBar = (SeekBar) findViewById(R.id.blueSeekBar);
        alphaBar = (SeekBar) findViewById(R.id.alphaSeekBar);
        colorV = (TextView) findViewById(R.id.colorView);


        btnUpdate.setOnClickListener(new View.OnClickListener()
        {
            //Austin Seawell helped me with this part of the code.
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Red seek is: " + redBar.getProgress());
                Log.i(TAG, "Blue seek is: " + greenBar.getProgress());
                Log.i(TAG, "Green seek is: " + blueBar.getProgress());
                Log.i(TAG, "Alpha seek is: " + alphaBar.getProgress());
                int  colorViewer = Color.argb(alphaBar.getProgress(), redBar.getProgress(), greenBar.getProgress(), blueBar.getProgress());
                colorV.setBackgroundColor(colorViewer);
                String textTest = Integer.toHexString(redBar.getProgress());
                colorV.setText(colorToHex(colorViewer));

                /**if (Color.argb(255, 0, 0, 0))
                {

                }

           **/}


        });


    }


    /**public void colorVisiblity()
    {
        if (alphaBar.getVisibility(View.))
        {
            colorV.setVisibility(View.VISIBLE);
        }
    }
    **/
    public void showMessage(View v)
    {
        Toast.makeText(getApplicationContext(),"Created by: John Tran \n Date created: 3/16/2016",
                Toast.LENGTH_SHORT).show();
    }

    //This code was provided by Dr. Lutz.
    private String colorToHex(int color)
    {
        return String.format("#%08X", (0xFFFFFFFF & color));

    }

}




