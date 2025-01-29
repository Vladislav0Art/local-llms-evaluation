package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedScriptType_Simple() {
        String type = "application/x-font-stylesheet";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertEquals(true, result);
    }

}