package com.example.android.miwok.Models;

/**
 * Created by gerardo on 06/06/17.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     *
     * @param mDefaultTranslation
     * @param mMiwokTranslation
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    /**
     *
     * @param mDefaultTranslation
     * @param mMiwokTranslation
     * @param mImageResourceId
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceId, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    /**
     * @return the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return the image id of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return the audio id of the word.
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
