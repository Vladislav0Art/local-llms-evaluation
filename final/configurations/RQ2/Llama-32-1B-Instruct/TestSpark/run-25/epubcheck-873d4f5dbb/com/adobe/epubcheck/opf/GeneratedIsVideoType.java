package com.adobe.epubcheck.opf;

public class GeneratedIsVideoType {

    @Test
    public void isVideoType() {
        // Test case for isVideoType()
        boolean result = opfChecker30.isVideoType("video");
        assertTrue(result);

        // Test case for isVideoType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isVideoType(null);
        assertFalse(result2);
    }

}