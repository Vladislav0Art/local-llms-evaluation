package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsCommonVideoType_Simple() {
        String type = "video/avi";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertEquals(true, result);
    }

}