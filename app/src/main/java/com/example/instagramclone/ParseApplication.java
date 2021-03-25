package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register our parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dSR7PVzQJBOXxKtswQocbvkiT1wNa1Wb9Xlny5MW")
                .clientKey("GVZMArkioUruDQ5h8eDlEmlB48k8pM6jGq4WY85j")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
