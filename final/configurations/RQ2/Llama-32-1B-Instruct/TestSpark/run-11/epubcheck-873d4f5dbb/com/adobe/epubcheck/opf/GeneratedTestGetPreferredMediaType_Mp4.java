package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_Mp4 {

    @Test
    public void testGetPreferredMediaType_Mp4() {
        boolean hasAudio = false;
        boolean hasVideo = false;

        Mp4Reader mp4Reader = new Mp4Reader();

        String path = "/test/path.mp4";
        assertEquals("/test/path.mp4", Mp4Reader.getPreferredMediaType("type", path));
    }

}