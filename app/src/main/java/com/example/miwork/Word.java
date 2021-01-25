package com.example.miwork;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String DefaultTranslation, String MiwokTranslation, int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mAudioResourceId=AudioResourceId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    public int getAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
