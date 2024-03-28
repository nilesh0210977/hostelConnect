package com.iiitdmk.gdsc.hackathon.Resources;

import android.os.Environment;


class CheckForSDCard {
    //Method to Check If SD Card is mounted or not
    static boolean isSDCardPresent() {
        return Environment.getExternalStorageState().equals(

                Environment.MEDIA_MOUNTED);
    }
}