package com.makethingskrakow.clickme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonActivity extends Activity implements OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_button);

    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(this);
  }

  @Override
  public void onClick(View button) {
    // PUT YOUR ACTIONS HERE

    // Uncomment this to change background color to green after clicking on the button
    // new ChangeBackgroundColor(0xff00ff00).perform(getWindow().getDecorView());

    // Uncomment this to change color of a button to random one after clicking on it
    // new ChangeBackgroundColor(new RandomColorGenerator().getRandomColor()).perform(button);

    // Uncomment this to change show "Hello world!" message after clicking the button
    // new ShowTextAction("Hello world!").perform(this);

    // Uncomment this to play a "bazinga" sound after clicking the button
    // new PlaySoundAction(R.raw.bazinga, this).play();
  }
}
