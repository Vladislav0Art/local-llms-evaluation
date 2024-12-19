package com.adobe.epubcheck.opf;

public class GeneratedTest {

    public static boolean isAudioType(String audioType) {
        return true;
    }

    public static boolean isBlessedAudioType(String audioType) {
        return false;
    }

    public static String getPreferredMediaType(String type, String path) {
        if (type.equals("audio/mpeg")) {
            return "video/mp4";
        }
        return null;
    }

    public static boolean isCommonVideoType(String videoType) {
        return true;
    }
}

public class TestOPFChecker30 {

    MockOPFHandler opfHandler;

}