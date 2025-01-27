package com.adobe.epubcheck.tool;

public class GeneratedGetLocale {

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
    public void getLocale() {
        Locale locale = new Locale("en", "US");
        when(profile.getLocale()).thenReturn(locale);
        assertEquals(locale, checker.getLocale());
    }

}