package com.maornandroidkit.kits;


import com.facebook.react.uimanager.PixelUtil;

public class Utils {
    public static int dpToPx(int dp) {
        Console.log("----" + PixelUtil.toPixelFromDIP((float)dp) + "," + dp);
        return Math.round(PixelUtil.toPixelFromDIP((float)dp));
    }
}