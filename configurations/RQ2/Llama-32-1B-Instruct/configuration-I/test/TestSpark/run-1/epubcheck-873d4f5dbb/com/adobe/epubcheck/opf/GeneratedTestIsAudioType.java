package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

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
    public void testIsAudioType() {
        opfHandler = new MockOPFHandler();
        assertEquals(true, opfHandler.isAudioType("audio/mpeg"));
        assertEquals(false, opfHandler.isBlessedAudioType("audio/mpeg"));
    }

}