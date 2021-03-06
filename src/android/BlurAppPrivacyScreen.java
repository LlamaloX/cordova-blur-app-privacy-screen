/**
 * BlurPrivacyScreen.java
 * Created by s3rious a.k.a Leonid Semenov on 09/09/2019
 * Copyright (c) 2019 s3rious a.k.a Leonid Semenov. All rights reserved.
 * MIT Licensed
 */
package com.llamalox.blurappprivacyscreen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class BlurAppPrivacyScreen extends CordovaActivity{
  @Override
  public void onCreate(Bundle savedInstanceState) {
   getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
   super.onCreate(savedInstanceState);
  }
}
