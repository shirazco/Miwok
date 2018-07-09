package com.example.android.miwok;

import android.media.Image;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Image resource id for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** is there an image for the word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Audio resource ID for the word */
    private int mAudioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceID is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the image resource id that describe the word
     * @param audioResourceID is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the audio resource ID of the word.
     */
    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    /**
     * Returns whether or not there is an image of the word.
     */
    public boolean hasImage() {
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
