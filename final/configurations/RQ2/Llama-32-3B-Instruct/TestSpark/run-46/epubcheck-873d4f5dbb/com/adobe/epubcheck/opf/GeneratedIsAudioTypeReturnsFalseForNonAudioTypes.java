package com.adobe.epubcheck.opf;

public class GeneratedIsAudioTypeReturnsFalseForNonAudioTypes {

    private OPFChecker30 opfChecker30;
    private ValidationContext context;

    @BeforeEach
    void setUp() {
        context = new ValidationContext();
        opfChecker30 = new OPFChecker30(context);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void isAudioTypeReturnsFalseForNonAudioTypes() {
        Assert.assertFalse(OPFChecker30.isAudioType("text/html"));
    }

}