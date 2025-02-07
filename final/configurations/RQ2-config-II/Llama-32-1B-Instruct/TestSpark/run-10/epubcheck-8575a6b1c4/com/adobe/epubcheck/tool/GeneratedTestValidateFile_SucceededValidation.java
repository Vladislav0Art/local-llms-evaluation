package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_SucceededValidation {

    public boolean validateFile(String path, int version, Report report, String profile) {
        return validateFile(path, version, report, profile, true);
    }

    public boolean validateFile(String path, int version, Report report, OPFChecker opfChecker) {
        // ... (other implementation)
    }
}

public class EpubCheckerTest {
    @Mock
    private FileResourceProvider fileProvider;

    @InjectMocks
    private EpubChecker epubChecker;

    @Mock
    private CheckingReport checkingReport;

    @Before
    public void setup() {
        // No setup required for this test
    }

    @Test
    public void testValidateFile_SucceededValidation() {
        String path = "test.opf";
        int version = 3;
        Report report = new DefaultReportImpl();
        EpubProfile profile = EPUBProfile.from("test.epub");

        when(fileProvider.getResource(path)).thenReturn(new FileResourceProvider(File.createTempFile("test", ".opf")));
        when(checkingReport.getCheckingReport()).thenReturn(checkingReport);

        int result = epubChecker.validateFile(path, version, report, new OPFChecker30());

        assertEquals(0, result);
    }

}