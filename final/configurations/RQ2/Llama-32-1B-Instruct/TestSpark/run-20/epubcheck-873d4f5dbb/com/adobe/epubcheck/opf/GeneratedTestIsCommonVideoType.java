package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsCommonVideoType() {
        String type = "video/mp4; codecs=libvpx-vp9";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertEquals(false, result); // by default not recognized
    }

}