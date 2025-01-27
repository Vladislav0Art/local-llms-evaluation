package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile {

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
    public void testValidateFile() {
        String path = "/path/to/file";
        EPUBVersion version = EPUBVersion.V3;
        Report report = new DefaultReportImpl();
        int result = checker.validateFile(path, version, report, profile);
        assertNotNull(result);
    }
}

public class EpubCheckFactoryTest {

    @Mock
    private OPSChecker opscChecker;

    @Mock
    private NavChecker navChecker;

    @Mock
    private OverlayChecker overlayChecker;

    @InjectMocks
    public void testCreateEpubCheck() {
        when(factory.createOPF30Checker()).thenReturn(opfChecker30);
        when(factory.createOPSChecker()).thenReturn(opscChecker);
        when(factory.createNavChecker()).thenReturn(navChecker);
        when(factory.createOverlayChecker()).thenReturn(overlayChecker);

        EpubCheck check = factory.createEpubCheck();
        assertNotNull(check);
    }
}

public class LocalizableReportTest {

    @Mock
    private MessageMapper messageMapper;

    @SpyBean
    public void testGetLocalizedMessage() {
        String expectedMessage = "localized.message";
        when(messageMapper.getMessage("messageKey")).thenReturn(expectedMessage);
        assertEquals(expectedMessage, report.getLocalizedMessage("messageKey"));
    }

}