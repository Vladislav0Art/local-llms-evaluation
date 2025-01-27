package com.adobe.epubcheck.tool;

public class GeneratedValidateFile {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @Mock
    private OPFChecker30 opfChecker30;

    @SpyBean
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker checker;

    @Test
    public void validateFile() {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.V3;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, profile);
        assertNotNull(result);
    }
}

}