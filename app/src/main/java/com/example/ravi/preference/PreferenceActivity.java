package com.example.ravi.preference;

import android.os.Bundle;

/**
 * Created by Ravi on 7/18/2016.
 */
public class PreferenceActivity extends android.preference.PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.sharedpreference   );
    }
}
