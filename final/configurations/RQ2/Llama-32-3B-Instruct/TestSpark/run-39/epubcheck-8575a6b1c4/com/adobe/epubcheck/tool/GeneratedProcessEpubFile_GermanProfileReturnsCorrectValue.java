package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_GermanProfileReturnsCorrectValue {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void processEpubFile_GermanProfileReturnsCorrectValue() {
        int result = eps.processEpubFile(new String[]{"arg1", "arg2"});
        assertEquals(0, result);
    }

}