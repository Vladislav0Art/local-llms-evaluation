package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    private MockOPFHandler opfHandler;
    private boolean isAudioType;

    @Test
    public void testIsBlessedAudioType() {
        opfHandler = new MockOPFHandler();
        isAudioType = false;
        assertEquals(false, opfHandler.isBlessedAudioType("audio/mpeg"));
    }

}