package com.google.android.exoplayer2.vr;

public final class DefaultOrientationMonitor implements OrientationMonitor, OrientationChangeListener {

  private int orientation;

  public DefaultOrientationMonitor() {
    this.orientation = 0;
  }

  @Override
  public synchronized void onOrientationChanged(int orientation) {
    this.orientation = orientation;
  }

  @Override
  public synchronized int getOrientation() {
    return this.orientation;
  }

}
