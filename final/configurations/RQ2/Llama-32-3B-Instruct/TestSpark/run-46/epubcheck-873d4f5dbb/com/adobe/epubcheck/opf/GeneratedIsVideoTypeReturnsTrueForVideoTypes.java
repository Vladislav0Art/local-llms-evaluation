package com.adobe.epubcheck.opf;

public class GeneratedIsVideoTypeReturnsTrueForVideoTypes {

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
    public void isVideoTypeReturnsTrueForVideoTypes() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}