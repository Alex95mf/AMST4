package com.example.amst4;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.amst4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView)findViewById(R.id.videoView2);
        MediaController mediaController = new MediaController( this);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse("https://www.youtube.com/watch?v=QPmxev7AB1k");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }

    /*final FloatingActionButton map_btn = (FloatingActionButton) findViewById(R.id.map_btn);
    map_btn.setOnClickListener((view) -> {
        Intent intent = new Intent (packageContext: MainActivity.this. Maps.class);
        startActivity(intent);
    });*/
}