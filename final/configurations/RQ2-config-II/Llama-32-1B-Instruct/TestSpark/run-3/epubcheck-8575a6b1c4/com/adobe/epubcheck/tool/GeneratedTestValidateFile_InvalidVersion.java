package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_InvalidVersion {

    private EpubChecker checker;

    @BeforeClass
    public static void setUp() {
        Locale locale = new Locale("en", "US");
        checker = new EpubChecker(locale);
    }

    @Test
    public void testValidateFile_InvalidVersion() {
        String path = "path/to/file.xml";
        EPUBVersion version = null;
        Report report = new DefaultReportImpl();
        try {
            int result = checker.validateFile(path, version, report, checker.getLocale());
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // expected exception
        }
    }

}