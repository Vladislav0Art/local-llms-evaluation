package com.adobe.epubcheck.tool;

public class GeneratedRun {

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
    public void run() {
        String[] args = {"-c", "path"};
        int result = checker.run(args);
        assertNotNull(result);
    }

}