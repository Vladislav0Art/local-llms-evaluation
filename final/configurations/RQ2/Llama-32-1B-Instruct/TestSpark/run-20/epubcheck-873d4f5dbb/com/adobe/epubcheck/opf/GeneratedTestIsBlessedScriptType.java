package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    private MockEPUBCheck30 mockEPUBCheck;
    private MockHandler mockHandler;

    @Before
    public void setup() {
        mockEPUBCheck = new MockEPUBCheck30();
        mockHandler = new MockHandler(mockEPUBCheck);
    }

    @Test
    public void testIsBlessedScriptType() {
        String type = "application/x-javascript";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertEquals(true, result);
    }

}