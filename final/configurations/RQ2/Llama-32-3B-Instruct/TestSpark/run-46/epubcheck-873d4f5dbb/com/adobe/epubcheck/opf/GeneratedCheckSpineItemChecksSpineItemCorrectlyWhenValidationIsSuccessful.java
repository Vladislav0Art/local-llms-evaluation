package com.adobe.epubcheck.opf;

public class GeneratedCheckSpineItemChecksSpineItemCorrectlyWhenValidationIsSuccessful {

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
    public void checkSpineItemChecksSpineItemCorrectlyWhenValidationIsSuccessful() throws Exception {
        OPFItem item = new OPFItem();
        opfChecker30.checkSpineItem(item, new OPFHandler());
        Assert.assertTrue(context.isValidationSuccessful());
    }

}