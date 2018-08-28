package ph.edu.iicsust.david.jazmineanne.lab2_displayevennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);

        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = 0;
                int number = 1;

                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                do{
                    if(number %2 ==0){
                       // resultTextView.setText(number + " ");
                        resultTextView.append(number + "\n");
                        counter++;
                    }
                        number = number + 1;
                }while(counter < 10);
            }
        });
    }
}
