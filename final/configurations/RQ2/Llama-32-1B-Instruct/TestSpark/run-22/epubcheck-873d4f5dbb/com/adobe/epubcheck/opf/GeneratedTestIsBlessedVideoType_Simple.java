package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedVideoType_Simple() {
        String type = "application/ogg;
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertEquals(false, result);
    }

}