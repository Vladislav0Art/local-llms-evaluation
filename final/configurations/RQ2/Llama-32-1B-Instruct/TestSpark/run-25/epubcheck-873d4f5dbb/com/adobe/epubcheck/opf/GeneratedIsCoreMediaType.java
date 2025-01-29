package com.adobe.epubcheck.opf;

public class GeneratedIsCoreMediaType {

    @Test
    public void isCoreMediaType() {
        // Test case for isCoreMediaType()
        boolean result = opfChecker30.isCoreMediaType("core");
        assertTrue(result);

        // Test case for isCoreMediaType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isCoreMediaType(null);
        assertFalse(result2);
    }

}