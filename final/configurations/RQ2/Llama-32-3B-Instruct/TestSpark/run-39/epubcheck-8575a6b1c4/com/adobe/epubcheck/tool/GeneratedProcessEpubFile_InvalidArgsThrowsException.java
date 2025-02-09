package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile_InvalidArgsThrowsException {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void processEpubFile_InvalidArgsThrowsException() {
        try {
            eps.processEpubFile(new String[]{});
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(Messages.INVALID_ARGS, e.getMessage());
        }
    }

}