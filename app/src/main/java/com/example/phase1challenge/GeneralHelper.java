package com.example.phase1challenge;

public class GeneralHelper {
    public static boolean isNotNullOrEmpty(final Object object) {
        if (object != null) {
            if (object instanceof String) {
                return !object.equals("");
            } else {
                return !object.toString().equals("");
            }
        }
        return false;
    }
}
