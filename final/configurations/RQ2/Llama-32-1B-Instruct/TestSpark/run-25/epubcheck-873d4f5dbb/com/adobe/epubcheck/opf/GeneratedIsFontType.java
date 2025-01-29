package com.adobe.epubcheck.opf;

public class GeneratedIsFontType {

    @Test
    public void isFontType() {
        // Test case for isFontType()
        boolean result = opfChecker30.isFontType("font");
        assertTrue(result);

        // Test case for isFontType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isFontType(null);
        assertFalse(result2);
    }

}