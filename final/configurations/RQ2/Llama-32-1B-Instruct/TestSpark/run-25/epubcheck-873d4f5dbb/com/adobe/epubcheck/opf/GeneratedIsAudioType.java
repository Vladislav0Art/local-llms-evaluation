package com.adobe.epubcheck.opf;

public class GeneratedIsAudioType {

    @Test
    public void isAudioType() {
        // Test case for isAudioType()
        boolean result = opfChecker30.isAudioType("audio");
        assertTrue(result);

        // Test case for isAudioType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isAudioType(null);
        assertFalse(result2);
    }

}