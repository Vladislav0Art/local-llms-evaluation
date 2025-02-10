package com.adobe.epubcheck.opf;

public class GeneratedTestPreferredMediaType {

    private static final int AUDIO_TYPE = 1;
    private static final int VIDEO_TYPE = 2;

    public boolean isAudioType(String mediaType) throws Exception {
        if (mediaType == null || mediaType.isEmpty()) {
            throw new NullPointerException("Media Type must not be null or empty");
        }
        return mediaType.startsWith("audio/");
    }

    public boolean isVideoType(String mediaType) throws Exception {
        if (mediaType == null || mediaType.isEmpty()) {
            throw new NullPointerException("Media Type must not be null or empty");
        }
        return mediaType.startsWith("video/");
    }

    public String getPreferredMediaType(String type, String path) {
        // implement logic here
        return "application/manifest+json";
    }

    public boolean isBlessedAudioType(String mediaType) {
        // implement logic here
        return true;
    }
}

public class TestOPFChecker30 {
    private static final int AUDIO_TYPE = 1;
    private static final int VIDEO_TYPE = 2;

    @Test
    public void testPreferredMediaType() throws Exception {
        OPFChecker30 opfChecker = new OPFChecker30();
        String preferredMedia = opfChecker.getPreferredMediaType("application/manifest", "path/to/file");
        Assert.assertEquals(preferredMedia, "application/manifest+json");
    }

}