package com.adobe.epubcheck.opf;

public class GeneratedCheckPackage {

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

}