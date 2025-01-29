package com.adobe.epubcheck.opf;

public class GeneratedCheckDictionary {

    @Test
    public void checkDictionary() {
        // Test case for checkDictionary()
        boolean result = opfChecker30.checkDictionary("audio");
        assertTrue(result);

        // Test case for checkDictionary() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.checkDictionary(null);
        assertFalse(result2);
    }

}