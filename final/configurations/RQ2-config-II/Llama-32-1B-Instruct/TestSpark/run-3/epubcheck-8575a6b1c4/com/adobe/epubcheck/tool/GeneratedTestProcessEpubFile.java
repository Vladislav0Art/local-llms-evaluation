package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile {

    private EpubChecker checker;

    @BeforeClass
    public static void setUp() {
        Locale locale = new Locale("en", "US");
        checker = new EpubChecker(locale);
    }

    @Test
    public void testProcessEpubFile() {
        String[] args = {"path/to/file.xml", "--output", "output.txt"};
        EpubChecker checker = new EpubChecker("en", Locale.ENGLISH);
        try {
            int result = checker.processEpubFile(args);
            assert result == 0; // expected success
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}