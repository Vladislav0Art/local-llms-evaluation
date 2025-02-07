package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_InvalidProfile {

    private EpubChecker checker;

    @BeforeClass
    public static void setUp() {
        Locale locale = new Locale("en", "US");
        checker = new EpubChecker(locale);
    }

    @Test
    public void testProcessEpubFile_InvalidProfile() {
        String[] args = {"path/to/file.xml", "--profile", "invalid"};
        try {
            int result = checker.processEpubFile(args);
            assert result == 1; // expected exception
        } catch (IOException e) {
            fail("Expected IOException");
        }
    }

}