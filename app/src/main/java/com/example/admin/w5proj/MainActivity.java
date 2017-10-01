package com.example.admin.w5proj;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Sample String objects
        String s1 = "", s2 = "", s3 = "Title";

        //openGooMap(s1,s2,s3);
    }

    public void openGooMap(String lat, String lng, String mTitle) {

        lat = "33.904559";
        lng = "-84.455208";

        String uri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + mTitle + ")";

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        context.startActivity(intent);
    }
}
