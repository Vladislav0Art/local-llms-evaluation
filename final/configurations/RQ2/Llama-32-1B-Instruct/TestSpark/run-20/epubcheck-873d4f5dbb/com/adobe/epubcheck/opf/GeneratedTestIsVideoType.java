package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsVideoType() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertEquals(true, result);
    }

}