package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    private MockOPFChecker30 mockOpfChecker;

    @Before
    public void setup() {
        mockOpfChecker = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedScriptType() {
        Optional<String> result = mockOpfChecker.isBlessedScriptType("script-type");
        assertTrue(result.isPresent());
        assertEquals("script-type", result.get());
    }

}