package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void checkPackage() {
        // Test case for checkPackage() using mock
        MockEDictionary dictMock = new MockEDictionary();
        when(opfChecker.checkPackage()).thenReturn(true);
        boolean result = opfChecker30.checkPackage(dictMock);
        assertTrue(result);

        // Test case for checkPackage() without mocking
        dictionaryMock = new MockEDictionary();
        when(opfChecker.checkPackage()).thenReturn(false);
        boolean result2 = opfChecker30.checkPackage(dictionaryMock);
        assertFalse(result2);
    }

    @Test
    public void checkItem() {
        // Test case for checkItem() using mock
        MockEDictionary dictMock = new MockEDictionary();
        when(opfChecker30.checkItem(OPFItem.class, null)).thenReturn(true);
        boolean result = opfChecker30.checkItem(null, dictMock);
        assertTrue(result);

        // Test case for checkItem() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkItem(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkItem(itemMock, null);
        assertTrue(result2);
    }

    @Test
    public void checkItemAfterResourceValidation() {
        // Test case for checkItemAfterResourceValidation()
        MockEDictionary dictMock = new MockEDictionary();
        when(opfChecker30.checkItemAfterResourceValidation(OPFItem.class)).thenReturn(true);
        boolean result = opfChecker30.checkItemAfterResourceValidation(null, null);
        assertTrue(result);

        // Test case for checkItemAfterResourceValidation() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkItemAfterResourceValidation(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkItemAfterResourceValidation(itemMock, null);
        assertTrue(result2);
    }

    @Test
    public void checkSpineItem() {
        // Test case for checkSpineItem()
        MockOPFItem spineItemMock = new MockOPFItem();
        when(opfChecker30.checkSpineItem(OPFItem.class, spineItemMock)).thenReturn(true);
        boolean result = opfChecker30.checkSpineItem(null, spineItemMock);
        assertTrue(result);

        // Test case for checkSpineItem() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkSpineItem(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkSpineItem(itemMock, null);
        assertTrue(result2);
    }

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