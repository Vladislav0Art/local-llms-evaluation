package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedScriptType {

    @Test
    public void isBlessedScriptType() {
        // Test case for isBlessedScriptType()
        boolean result = opfChecker30.isBlessedScriptType("script");
        assertTrue(result);

        // Test case for isBlessedScriptType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isBlessedScriptType(null);
        assertFalse(result2);
    }

}