package com.adobe.epubcheck.tool;

public class GeneratedGetLocalizedMessage {

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
    public void getLocalizedMessage() {
        String expectedMessage = "localized.message";
        when(messageMapper.getMessage("messageKey")).thenReturn(expectedMessage);
        String result = report.getLocalizedMessage("messageKey");
        assertEquals(expectedMessage, result);
    }

}