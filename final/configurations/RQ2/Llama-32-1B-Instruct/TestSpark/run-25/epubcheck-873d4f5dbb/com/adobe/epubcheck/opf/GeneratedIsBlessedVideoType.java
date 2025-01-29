package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedVideoType {

    @Test
    public void isBlessedVideoType() {
        // Test case for isBlessedVideoType()
        boolean result = opfChecker30.isBlessedVideoType("video");
        assertTrue(result);

        // Test case for isBlessedVideoType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isBlessedVideoType(null);
        assertFalse(result2);
    }

}