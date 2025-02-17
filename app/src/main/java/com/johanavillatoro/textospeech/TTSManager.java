package com.johanavillatoro.textospeech;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.Locale;

public class TTSManager {
    private TextToSpeech mTts = null;
    private boolean isLoaded = false;

    public void init(Context context){
        try {
            mTts = new TextToSpeech(context, onInitListener);
        } catch (Exception e){
            e.printStackTrace();

        }
    }

    private TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int status) {

            Locale spanish = new Locale("es", "ES");
            if (status == TextToSpeech.SUCCESS) {

                int result = mTts.setLanguage(Locale.getDefault());
                isLoaded = true;

                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("error", "Este Lenguaje no esta permitido");
                }
            } else {
                Log.e("error", "Fallo al Inicilizar!");
            }
        }
    };

    public void shutDown() {
        mTts.shutdown();
    }


    public void initQueue(String text) {

        if (isLoaded)
            mTts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        else
            Log.e("error", "TTS Not Initialized");
    }

}
