package com.brianjanicekendra.interactivestory.model;

/**
 * Created by Guest on 12/1/15.
 */
public class Choice {

    private String mText;
    private int mIndex;
    private int mNextPage;
    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        mIndex = index;
    }

}
