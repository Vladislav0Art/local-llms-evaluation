package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsFontType_Simple() {
        String type = "application/octet-stream";
        boolean result = OPFChecker30.isFontType(type);
        assertEquals(false, result);
    }

}