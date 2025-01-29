package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedFontType_Simple() {
        String type = "font/ttf";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertEquals(false, result);
    }

}