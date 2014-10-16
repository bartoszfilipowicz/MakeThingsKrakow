package com.makethingskrakow.clickme.actions;

import android.view.View;

/**
 * Use this action to change the background color of a View.
 *
 * To change background of an Activity:
 * new ChangeBackgroundColor(0xff00ff00).perform(getWindow().getDecorView())
 *
 * To change background of a Button:
 * new ChangeBackgroundColor(0xff00ff00).perform(button)
 *
 */

public class ChangeBackgroundColor {
  private final int mColor;

  public ChangeBackgroundColor(int color) {
    mColor = color;
  }

  public void perform(View view) {
    view.setBackgroundColor(mColor);
  }
}
