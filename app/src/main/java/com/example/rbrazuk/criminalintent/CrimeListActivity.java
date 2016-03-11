package com.example.rbrazuk.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by rossbrazuk1 on 3/11/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
