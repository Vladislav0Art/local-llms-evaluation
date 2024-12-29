package com.adobe.epubcheck.tool;

public class GeneratedTestGetLocale_emptyReturnsDefault {

    public static class LocaleHolder {
        public static final Locale locale = Locale.US;
    }

    public static class EpubChecker {
        public static Locale getLocale() {
            return LocaleHolder.locale;
        }
    }
}

public class GeneratedTest {

    @Test
    public void testGetLocale_emptyReturnsDefault() {
        EpubChecker.EpubChecker(Locale.class, null);
        assertEquals(EpubChecker LocaleHolder.locale, EpubChecker.getLocale());
    }

}