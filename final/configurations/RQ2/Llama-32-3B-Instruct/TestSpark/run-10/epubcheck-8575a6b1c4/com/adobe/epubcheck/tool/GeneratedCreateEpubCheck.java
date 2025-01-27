package com.adobe.epubcheck.tool;

public class GeneratedCreateEpubCheck {

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
    public void createEpubCheck() {
        when(factory.createOPF30Checker()).thenReturn(opfChecker30);
        when(factory.createOPSChecker()).thenReturn(opscChecker);
        when(factory.createNavChecker()).thenReturn(navChecker);
        when(factory.createOverlayChecker()).thenReturn(overlayChecker);
        EpubCheck check = factory.createEpubCheck();
        assertNotNull(check);
    }
}

}