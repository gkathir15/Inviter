package com.guru.inviter.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.guru.inviter.R;
import com.guru.inviter.model.InviteDetails;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    GetInviteInfo getInviteInfo = new GetInviteInfo();
    InviteDetails inviteDetails = new InviteDetails();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to handle app links.
//        Intent appLinkIntent = getIntent();
//        String appLinkAction = appLinkIntent.getAction();
//        Uri appLinkData = appLinkIntent.getData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
       inviteDetails.setPostfix(appLinkIntent.getData());
        Log.d( "Postfix", String.valueOf(inviteDetails.getPostfix()));


    }

    public class GetInviteInfo extends AsyncTask<URI,Void,Void>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }

        @Override
        protected Void doInBackground(URI... uris) {
            return null;
        }
    }
}
