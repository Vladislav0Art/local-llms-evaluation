package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaTypeReturnsPreferredMediaTypeWhenPathIsNotEmpty {

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
    public void getPreferredMediaTypeReturnsPreferredMediaTypeWhenPathIsNotEmpty() throws Exception {
        String type = "application/manifest+json";
        String path = "/path/to/file";
        Assert.assertEquals(OPFChecker30.getPreferredMediaType(type, path), "application/manifest+json");
    }

}