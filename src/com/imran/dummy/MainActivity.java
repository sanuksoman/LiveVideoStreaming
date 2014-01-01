package com.imran.dummy;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
/*
 * Sample project of live stream
 * Developer : sanu
 * Date      : 1/1/2014
 * Time      : 7:43 PM
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		String path1="http://devimages.apple.com/iphone/samples/bipbop/gear1/prog_index.m3u8";
		Uri uri=Uri.parse(path1);
		VideoView video=(VideoView)findViewById(R.id.video);
		video.setVideoURI(uri);
		video.start();
	}

}
