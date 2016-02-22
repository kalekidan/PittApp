package com.example.yeshiwak.pittapp;

import android.app.Application;
import com.parse.Parse;
/**
 * Created by yeshiwak on 2/22/16.
 */
public class PittAppUserTEST extends Application {

        private final String APPLICATION_ID = "";
        private final String CLIENT_KEY = "";

        @Override
        public void onCreate() {
            super.onCreate();

            Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);

/*        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("message", "hello world!");
        testObject.saveInBackground();
*/
        }

    }

}
