package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsAudioType() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isAudioType(type);
        assertEquals(true, result);
    }

}