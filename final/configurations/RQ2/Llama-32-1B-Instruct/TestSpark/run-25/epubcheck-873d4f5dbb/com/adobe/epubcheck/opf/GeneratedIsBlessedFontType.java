package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedFontType {

    @Test
    public void isBlessedFontType() {
        // Test case for isBlessedFontType()
        boolean result = opfChecker30.isBlessedFontType("font");
        assertTrue(result);

        // Test case for isBlessedFontType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isBlessedFontType(null);
        assertFalse(result2);
    }

}