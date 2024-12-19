package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    public boolean isAudioType(String audioType) {
        return true;
    }

    public boolean isBlessedAudioType(String audioType) {
        return false;
    }

    public String getPreferredMediaType(String type, String path) {
        if (type.equals("audio/mpeg")) {
            return "video/mp4";
        }
        return null;
    }

    public boolean isCommonVideoType(String videoType) {
        return true;
    }
}

public class TestOPFChecker30 {

    MockOPFHandler opfHandler;

    @Test
    public void testGetPreferredMediaType() {
        String type = "video/mp4";
        String path = "/path/to/video.mp4";
        assertEquals("video/mp4", opfHandler.getPreferredMediaType(type, path));
        assertEquals("video/mp4", opfHandler.getPreferredMediaType("audio/mpeg", path));
    }

}