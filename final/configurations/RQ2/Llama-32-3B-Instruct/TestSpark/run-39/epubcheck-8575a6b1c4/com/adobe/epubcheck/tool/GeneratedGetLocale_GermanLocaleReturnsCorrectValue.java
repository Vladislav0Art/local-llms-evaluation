package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_GermanLocaleReturnsCorrectValue {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void getLocale_GermanLocaleReturnsCorrectValue() {
        Locale locale = eps.getLocale();
        assertEquals(Locale.GERMAN, locale);
    }

}