package com.adobe.epubcheck.opf;

public class GeneratedTest {

    public static String getPreferredMediaType(String mediaType, String path) {
        if (mediaType == null || path == null) {
            throw new NullPointerException("Media type and path cannot be null");
        }
        return mediaType;
    }

    public static String getPreferredMedian(String mediaType, String path) {
        if (mediaType.equals("audio") && path.contains("path")) {
            return "audio";
        } else if (mediaType.equals("video") && path.contains("invalid_path")) {
            return "video";
        }
        return "";
    }
}

public class TestOpfChecker30 {

}