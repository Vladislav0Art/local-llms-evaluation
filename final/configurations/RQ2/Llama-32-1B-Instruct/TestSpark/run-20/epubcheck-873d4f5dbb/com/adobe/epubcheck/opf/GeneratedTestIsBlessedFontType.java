package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsBlessedFontType() {
        String type = "image/png; codecs=libjpeg";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertEquals(false, result); // by default not recognized
    }

}