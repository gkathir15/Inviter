package com.guru.inviter.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.guru.inviter.R;
import com.guru.inviter.model.InviteDetails;

import org.w3c.dom.Text;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    GetInviteInfo getInviteInfo = new GetInviteInfo();
    InviteDetails inviteDetails = new InviteDetails();
    Uri mBaseaUri;
    TextView mTitle,mDate,mTime,mRsvp,mPlace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
       String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        Log.d( "Path", String.valueOf(appLinkData));
        mBaseaUri = appLinkData;
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
            mTitle.setText(inviteDetails.getUser()+"'s"+inviteDetails.getTitle());
            mDate.setText(inviteDetails.getDate());
            mTime.setText(inviteDetails.getTime());
            mPlace.setText(inviteDetails.getVenue());
        }

        @Override
        protected Void doInBackground(URI... uris) {
            return null;
        }




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getInviteInfo.cancel(true);
    }
}
