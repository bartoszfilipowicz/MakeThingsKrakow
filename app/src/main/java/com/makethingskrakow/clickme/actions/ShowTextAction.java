package com.makethingskrakow.clickme.actions;

import android.content.Context;
import android.widget.Toast;

/**
 * Use this action to show a Toast with a text.
 *
 * Usage from Activity:
 * new ShowTextAction("Hello World").perform(Activity.this)
 *
 */
public class ShowTextAction {
  private final String mText;

  public ShowTextAction(String text) {
    mText = text;
  }

  public void perform(Context context) {
    Toast.makeText(context, mText, Toast.LENGTH_LONG).show();
  }
}
