package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_OPFTypeMediaTypes {

    @Test
    public void testGetPreferredMediaType_OPFTypeMediaTypes() {
        assertTrue(OPFChecker30.getPreferredMediaType("audio", "file:///path/to/audio.mp3").equals("audio"));
        assertTrue(OPFChecker30.getPreferredMediaType("video", "file:///path/to/video.mp4").equals("video"));
        assertTrue(OPFChecker30.getPreferredMediaType("common", "file:///path/to/common.mp4").equals("common"));
    }

}