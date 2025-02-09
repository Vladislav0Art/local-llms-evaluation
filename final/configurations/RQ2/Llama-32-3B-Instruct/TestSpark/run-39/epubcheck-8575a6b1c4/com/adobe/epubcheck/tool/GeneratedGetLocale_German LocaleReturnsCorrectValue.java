package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_German LocaleReturnsCorrectValue {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void getLocale_German

    LocaleReturnsCorrectValue() {
        Locale locale = epsgetLocale();
        assertEquals(Locale.GERMAN, locale);
    }

}