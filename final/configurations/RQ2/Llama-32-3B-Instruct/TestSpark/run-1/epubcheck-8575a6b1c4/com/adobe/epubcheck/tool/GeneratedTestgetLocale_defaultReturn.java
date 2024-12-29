package com.adobe.epubcheck.tool;

public class GeneratedTestgetLocale_defaultReturn {

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
    public void testgetLocale_defaultReturn() {
        Locale locale = EpubChecker.getLocale();
        assertNotNull(locale);
    }

}