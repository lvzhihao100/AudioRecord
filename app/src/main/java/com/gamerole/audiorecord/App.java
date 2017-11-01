package com.gamerole.audiorecord;

import android.app.Application;

import cafe.adriel.androidaudioconverter.AndroidAudioConverter;
import cafe.adriel.androidaudioconverter.callback.ILoadCallback;

/**
 * @author吕志豪 .
 * @date 17-11-1  下午2:34.
 * Github :https://github.com/lvzhihao100
 * E-Mail：1030753080@qq.com
 * 简书 :http://www.jianshu.com/u/6e525b929aac
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidAudioConverter.load(this, new ILoadCallback() {
            @Override
            public void onSuccess() {
                // Great!
                System.out.println("great");
            }

            @Override
            public void onFailure(Exception error) {
                System.out.println("FFmpeg is not supported by device");
            }
        });
    }
}
