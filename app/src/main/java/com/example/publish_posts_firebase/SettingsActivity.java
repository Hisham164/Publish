package com.example.publish_posts_firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;

public class SettingsActivity extends AppCompatActivity {

    SwitchCompat postSwitch;


    //use shared preferences to save the state of Switch
    SharedPreferences sp;
    SharedPreferences.Editor editor; //to edit value of shared pref

    //constant for topic
    private static final String TOPIC_POST_NOTIFICATION = "POST"; //assign any value but use same for this kind of notification
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        postSwitch = findViewById(R.id.postSwitch);

        //implement switch change listener
        postSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

               /* if (isChecked){
                    subscribePostNotification();//
                }
                else {
                    unsubscribePostNotification();//call to unsubscribe
                }*/
            }
        });
    }
}