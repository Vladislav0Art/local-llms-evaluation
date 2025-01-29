package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsBlessedVideoType() {
        String type = "video/mp4; codecs=libvpx-mbg";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertEquals(true, result);
    }

}