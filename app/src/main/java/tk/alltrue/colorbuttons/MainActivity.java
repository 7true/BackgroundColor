package tk.alltrue.colorbuttons;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textViewInfo);

        final Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        final Button redButton = (Button) findViewById(R.id.buttonRed);
        final Button greenButton = (Button) findViewById(R.id.buttonGreen);

        yellowButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

//        yellowButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mInfoTextView.setText(R.string.yellow);
//                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                break;
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                break;
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                break;
        }
    }


//    public void onRedButtonClick(View view) {
//        mInfoTextView.setText(R.string.red);
//        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
//    }
//
//    public void onGreenButtonClick(View view) {
//        mInfoTextView.setText(R.string.green);
//        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
//    }

}
