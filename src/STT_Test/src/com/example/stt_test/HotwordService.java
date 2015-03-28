package com.example.stt_test;


import android.content.Intent;
import android.os.Bundle;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.AlwaysOnHotwordDetector.Callback;
import android.service.voice.VoiceInteractionService;
import android.util.Log;

import java.util.Locale;
/**
 * @file HotwordService.java
 * 
 * @brief Detect hot words
 * @details If you are an early-adapter, you'll know about the voice-control function 'OK, GOOGLE'.
 *          It works with the class 'AlwaysOnHotwordDetector'. If your device is in charge, your device will react when 
 *          you speak the word which listed in 'Hot word'. 
 * 
 *          - This program is designed for korean words. 
 *          - Minimum SDK Version of 'AlwaysOnHotwordDetector' is '21'
 * 
 * @todo - make Hotword list for In-vehicle System 
 *       - Need to test Voice interaction service when I got a device. It dosen't worked in AVD.
 * 
 * @date 2015-03-28
 * @author YoonseungChoi
 * @version 0.1
 * 
 */
public class HotwordService extends VoiceInteractionService {

  private final String LOG_TAG = "HotwordService";

  Locale locale = new Locale("ko-kr");

  AlwaysOnHotwordDetector hotwordDetector;

  @Override
  public void onCreate() {

    Log.i(LOG_TAG, "onCreate");

    super.onCreate();

  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {

    Log.i(LOG_TAG, "onStartCommand");

    Bundle args = new Bundle();

    startSession(args);
    stopSelf(startId);

    return START_NOT_STICKY;

  }

  @Override
  public void onReady() {

    Log.i(LOG_TAG, "onReady");

    super.onReady();

    hotwordDetector = createAlwaysOnHotwordDetector("안녕", locale, callback);

  }

  Callback callback = new Callback() {

    @Override
    public void onRecognitionResumed() {
      // TODO Auto-generated method stub
    }

    @Override
    public void onRecognitionPaused() {
      // TODO Auto-generated method stub
    }

    @Override
    public void onError() {
      // TODO Auto-generated method stub
      Log.d(LOG_TAG, "error");
    }

    @Override
    public void onDetected(AlwaysOnHotwordDetector.EventPayload eventPayload) {
      Log.d(LOG_TAG, "onDetected");
    }

    @Override
    public void onAvailabilityChanged(int status) {
      // TODO Auto-generated method stub
    }

  };
}
