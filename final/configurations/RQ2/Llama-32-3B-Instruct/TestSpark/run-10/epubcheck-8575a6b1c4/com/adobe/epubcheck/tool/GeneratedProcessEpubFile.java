package com.adobe.epubcheck.tool;

public class GeneratedProcessEpubFile {

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
    public void processEpubFile() {
        // Not implemented as deprecated method
    }

}