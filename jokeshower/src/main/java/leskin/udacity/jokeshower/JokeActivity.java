package leskin.udacity.jokeshower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private String joke = "";

    public static void launch(Context context, String joke) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra("joke", joke);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        getExtras();

        TextView jokeText = (TextView) findViewById(R.id.text_joke);
        jokeText.setText(joke);
    }

    private void getExtras() {
        if (getIntent().getExtras() != null) {
            joke = getIntent().getStringExtra("joke");
        }
    }
}
