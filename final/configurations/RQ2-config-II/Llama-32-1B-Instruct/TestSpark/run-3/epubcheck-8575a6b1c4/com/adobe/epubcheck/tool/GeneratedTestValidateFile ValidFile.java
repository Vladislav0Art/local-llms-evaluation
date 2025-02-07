package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile ValidFile {

    private EpubChecker checker;

    @BeforeClass
    public static void setUp() {
        Locale locale = new Locale("en", "US");
        checker = new EpubChecker(locale);
    }

    @Test
    public void testValidateFile

    ValidFile() {
        String path = "path/to/file.xml";
        EPUBVersion version = EPUBVersion.VERSION_2;
        Report report = new DefaultReportImpl();
        try {
            int result = checker.validateFile(path, version, report, checker.getLocale());
            assert result == 0; // expected success
        } catch (InvalidVersionException e) {
            fail("Expected InvalidVersionException");
        }
    }

}