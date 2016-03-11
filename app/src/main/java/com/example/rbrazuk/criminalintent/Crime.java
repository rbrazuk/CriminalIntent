package com.example.rbrazuk.criminalintent;

import java.util.UUID;

/**
 * Created by rossbrazuk1 on 3/11/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}
