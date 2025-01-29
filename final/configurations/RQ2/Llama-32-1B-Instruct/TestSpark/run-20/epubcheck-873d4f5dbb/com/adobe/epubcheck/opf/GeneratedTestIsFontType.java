package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsFontType() {
        String type = "image/png";
        boolean result = OPFChecker30.isFontType(type);
        assertEquals(true, result);
    }

}