package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_Mp4NoType {

    @Test
    public void testGetPreferredMediaType_Mp4NoType() {
        boolean hasAudio = false;
        boolean hasVideo = false;

        String preferredMediaType = Mp4Reader.getPreferredMediaType(null, null);

        if (preferredMediaType != null) {
            assertEquals("/test/path.mp4", preferredMediaType);
        } else {
            assertEquals(null, preferredMediaType);
        }
    }

}