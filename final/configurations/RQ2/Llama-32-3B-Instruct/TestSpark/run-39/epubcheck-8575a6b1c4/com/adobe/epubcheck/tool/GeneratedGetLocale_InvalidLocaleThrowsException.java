package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_InvalidLocaleThrowsException {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void getLocale_InvalidLocaleThrowsException() {
        try {
            eps.getLocale();
            fail("Expected exception not thrown");
        } catch (UnsupportedOperationException e) {
            assertEquals(Messages.LOCALE_NOT_SUPPORTED, e.getMessage());
        }
    }

}