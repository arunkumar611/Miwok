package com.example.android.miwok;

public class ReportCard {

    private String mStudentName;
    private int mEnglishScore;
    private int mMathScore;
    private int mScienceScore;
    private int mSocialScienceScore;
    private int mComputerScienceScore;

    private int mTotalMarksScored = mEnglishScore + mMathScore + mScienceScore + mSocialScienceScore + mComputerScienceScore;
    private static final int mTotalMarks = 500;
    private int mPercentage = mTotalMarksScored / mTotalMarks;

    public ReportCard(String studentName, int englishScore, int mathScore, int scienceScore, int socialScienceScore, int computerScienceScore) {
        mStudentName = studentName;
        mEnglishScore = englishScore;
        mMathScore = mathScore;
        mScienceScore = scienceScore;
        mSocialScienceScore = socialScienceScore;
        mComputerScienceScore = computerScienceScore;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public int getEnglishScore() {
        return mEnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        mEnglishScore = englishScore;
    }

    public int getMathScore() {
        return mMathScore;
    }

    public void setMathScore(int mathScore) {
        mMathScore = mathScore;
    }

    public int getScienceScore() {
        return mScienceScore;
    }

    public void setScienceScore(int scienceScore) {
        mScienceScore = scienceScore;
    }

    public int getSocialScienceScore() {
        return mSocialScienceScore;
    }

    public void setSocialScienceScore(int socialScienceScore) {
        mSocialScienceScore = socialScienceScore;
    }

    public int getComputerScienceScore() {
        return mComputerScienceScore;
    }

    public void setComputerScience(int computerScienceScore) {
        mComputerScienceScore = computerScienceScore;
    }

    public int getTotalMarksScored() {
        return mTotalMarksScored;
    }

    public int getPercentage() {
        return mPercentage;
    }

    public String toString() {
        String toString = "Student Name: " + getStudentName() + "\nEnglish: " + getEnglishScore();
        toString = toString + "\nMath: " + getMathScore() + "\nScience: " + getScienceScore();
        toString = toString + "\nSocial Science:" + getSocialScienceScore() + "\nComputer Science: " + getComputerScienceScore();
        toString = toString + "\n\nTotal Marks" + getTotalMarksScored() + "out of " + mTotalMarksScored;
        toString = toString + "\nPercentage" + getPercentage();
        return toString;
    }

}
