package com.hqetpe.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;

/**
 * Created by YW on 12/15/15.
 */
public class RibbitApplication extends Application {
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        //Parse.initialize(this, "api key", "client id");
        Parse.initialize(this, "vGWizyUFesjLYGM6yhOR9Svepwhkj8zyZuc7dWEy", "PZKfdSL2MYsiqGfdnkwcQbz4cD9BfvNgeo1xGir0");
        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo1", "bar1");
        //testObject.saveInBackground();

        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
