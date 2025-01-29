package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsBlessedAudioType() {
        String type = "audio/mpeg; codecs=libmp3lame";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertEquals(true, result);
    }

}