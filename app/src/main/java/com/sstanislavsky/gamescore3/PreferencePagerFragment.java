package com.sstanislavsky.gamescore3;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class PreferencePagerFragment extends PreferenceFragmentCompat {

    public static PreferencePagerFragment newInstance() {
        return new PreferencePagerFragment();
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_pager, rootKey);
    }
}
