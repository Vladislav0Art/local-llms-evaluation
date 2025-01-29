package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsCoreMediaType() {
        String type = "image/png";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertEquals(true, result);
    }

}