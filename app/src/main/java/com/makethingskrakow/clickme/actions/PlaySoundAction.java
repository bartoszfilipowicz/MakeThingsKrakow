package com.makethingskrakow.clickme.actions;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Use this action to play a sound.
 * Sound files must be copied to res/raw directory of the project.
 *
 * example:
 * Usage from Activity:
 * new PlaySoundAction(R.raw.bazinga).perform(Activity.this)
 */

public class PlaySoundAction {
  private final int mSoundResource;
  private final MediaPlayer mMediaPlayer;

  public PlaySoundAction(int soundResource, Context context) {
    mSoundResource = soundResource;
    mMediaPlayer = MediaPlayer.create(context, soundResource);
  }

  public void play() {
    mMediaPlayer.start();
  }
}
