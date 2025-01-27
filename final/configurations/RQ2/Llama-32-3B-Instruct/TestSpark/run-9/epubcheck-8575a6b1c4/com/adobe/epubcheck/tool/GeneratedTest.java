package com.adobe.epubcheck.tool;

public class GeneratedTest {

    @Test
    public void testGetLocale() {
        Locale locale = EpubChecker(Locale.ROOT).getLocale();
        assertNotNull(locale);
    }

    @Test
    public void testRunWithValidArgs() throws IOException, Exception {
        String[] args = {"-p", "epub3"};
        int result = EpubChecker(args).run(args);
        assertTrue(result == 0);
    }

    @Test
    public void testRunWithoutArguments() throws IOException, Exception {
        String[] args = {};
        int result = EpubChecker(args).run(args);
        assertTrue(result >= 0 && result <= 1);
    }

}