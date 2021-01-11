package com.thronie.advertisingid;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class AdvertisingIdModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public AdvertisingIdModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "AdvertisingId";
    }

    @ReactMethod
    public void getAdvertisingId(Promise result) {

        reactContext.runOnNativeModulesQueueThread(new AdvertisingIdThread(reactContext, result));
    }
}
