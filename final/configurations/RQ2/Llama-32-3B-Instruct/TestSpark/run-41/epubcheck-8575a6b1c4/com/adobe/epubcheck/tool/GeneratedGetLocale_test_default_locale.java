package com.adobe.epubcheck.tool;

public class GeneratedGetLocale_test_default_locale {

    public static Locale getLocale() {
        return Locale.getDefault();
    }

    public static int run(String[] args) throws Exception {
        // Implement your logic here
        return 0;
    }
}

public class ValidationContextBuilder {
    public ValidationContext build(Map<String, String> validationContext) {
        // Implement your logic here
        return null;
    }
}

public class EpubCheckerTest {

    @Test
    public void getLocale_test_default_locale() {
        Locale locale = EpubChecker.getLocale();
        assertNotNull(locale);
    }

}