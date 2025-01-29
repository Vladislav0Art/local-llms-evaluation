package com.adobe.epubcheck.opf;

public class GeneratedIsCommonVideoType {

    @Test
    public void isCommonVideoType() {
        // Test case for isCommonVideoType()
        boolean result = opfChecker30.isCommonVideoType("video");
        assertTrue(result);

        // Test case for isCommonVideoType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isCommonVideoType(null);
        assertFalse(result2);
    }

}