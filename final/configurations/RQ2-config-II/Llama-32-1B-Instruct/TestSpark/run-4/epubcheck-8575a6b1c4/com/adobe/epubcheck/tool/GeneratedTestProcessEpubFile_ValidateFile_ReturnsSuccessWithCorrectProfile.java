package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_ValidateFile_ReturnsSuccessWithCorrectProfile {

    private MockChecker mockChecker;
    private FileResourceProvider fileResourceProvider;

    @Mock
    public void whenGetLocaleReturnsLocale() throws Exception {
        Locale locale = new Locale("en", "US");
        setLocale(locale);
    }

    @Mock
    public void whenRunReturnsReport(int code) throws IOException, InvalidVersionException {
        mockChecker.run(null, null, (report, profile) -> report, null).assertThat().isValueOf(code);
    }

    @Test
    public void testProcessEpubFile_ValidateFile_ReturnsSuccessWithCorrectProfile() throws Exception {
        Locale locale = new Locale("en", "US");
        setLocale(locale);
        whenGetEpubFilePath().thenReturn(null);
        mockChecker.processEpubFile(null, null, (report) -> report, null).assertThat().isTrue();
    }

}