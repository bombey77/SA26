package bombey77.sa26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnTime, btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button)findViewById(R.id.btnTime);
        btnDate = (Button)findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent1, intent2;

        switch (v.getId()) {
            case R.id.btnTime:
                intent1 = new Intent("bombey77.intent.first.time");
                startActivity(intent1);
                break;
            case R.id.btnDate:
                intent2 = new Intent("bombey77.intent.second.date");
                startActivity(intent2);
                break;
            default:
                break;
        }

        }
}
