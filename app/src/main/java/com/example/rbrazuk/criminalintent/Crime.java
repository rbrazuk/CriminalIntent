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

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
