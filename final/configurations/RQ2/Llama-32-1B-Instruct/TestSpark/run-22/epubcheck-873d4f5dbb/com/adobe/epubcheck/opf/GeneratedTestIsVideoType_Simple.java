package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsVideoType_Simple() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertEquals(true, result);
    }

}