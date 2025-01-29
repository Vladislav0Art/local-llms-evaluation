package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedAudioType {

    @Test
    public void isBlessedAudioType() {
        // Test case for isBlessedAudioType()
        boolean result = opfChecker30.isBlessedAudioType("audio");
        assertTrue(result);

        // Test case for isBlessedAudioType() without mocking
        dictionaryMock = new MockEDictionary();
        result2 = opfChecker30.isBlessedAudioType(null);
        assertFalse(result2);
    }

}