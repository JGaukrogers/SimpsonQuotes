package cat.exemple.judith.frases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Frases extends AppCompatActivity {

    private String frases[] = {
            "D'oh!",
            "I didn't do it!",
            "God loves you, he will kill you all!",
            "Ha-Ha!",
            "Mmm... Bacon!",
            "Lisa, if I've learned anything, it's that life is just one crushing defeat after another until you just wish Flanders was dead.",
            "Sorry mom, the mob has spoken.",
            "So I said to myself: what would God do in this situation?",
            "And I'm not easily impressed. WOW, A BLUE CAR!",
            "Since the beginning of time, man has yearned to destroy the sun.",
            "There's an angry mob here to see you, sir.",
            "It's just like I've always said: Democracy doesn't work.",
            "Elementary chaos theory shows that all robots must inevitably run amok.",
            "You'll release the dogs, or the bees, or the dogs with bees in their mouths, and when they bark, they shoot bees at you?",
            "Yeah, well, we saved your asses in World War III.",
            "\"There's an adorable little boy here to see you sir.\" \"Release the hounds.\"",
            "Well, Homer. I earned your respect. And all I had to do was save your life. Now, if every other gay person could save your life, we'd be set.",
            "You've crossed the line from regular villainy into cartoonish super-villainy.",
            "Is this the end of Zombie Shakespeare?!",
            "You're in direct competition with each other! Fight, fight, fight, fight, fight, fight, fight!",
            "If anyone needs me, I'll be in my room."
            };
    private TextView text_view;
    private int current_sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);

        text_view = (TextView)findViewById(R.id.textView);

        //Initialize sentence
        Double rand = Math.random() * 100;
        current_sentence = rand.intValue() % frases.length;
        text_view.setText(frases[current_sentence]);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frases, menu);
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

    public void changeSentenceRand(View view) {

        Double rand = Math.random() * 100;
        while(current_sentence == (rand.intValue() % frases.length)){
            rand = Math.random() * 100;
        }

        current_sentence = rand.intValue() % frases.length;
        text_view.setText(frases[current_sentence]);

    }

    public void changeSentenceNext(View view) {
        current_sentence = (current_sentence + 1) % frases.length;
        text_view.setText(frases[current_sentence]);
    }
}
