package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @Mock
    private OPFChecker30 opfChecker30;

    @SpyBean
    private LocalizableReport report;

    @InjectMocks
    public void testCreateEpubCheck() {
        when(factory.createOPSChecker()).thenReturn(opscChecker);
        when(factory.createNavChecker()).thenReturn(navChecker);
        when(factory.createOverlayChecker()).thenReturn(overlayChecker);

        List<EpubCheck> checks = Arrays.asList(opfChecker30, opscChecker, navChecker, overlayChecker);
        factory.createEpubChecks(checks);

        assertNotNull(chacks);
    }

    @Test
    public void testRun() {
        String[] args = {"-c", "path"};
        int result = checker.run(args);
        assertNotNull(result);
    }

}