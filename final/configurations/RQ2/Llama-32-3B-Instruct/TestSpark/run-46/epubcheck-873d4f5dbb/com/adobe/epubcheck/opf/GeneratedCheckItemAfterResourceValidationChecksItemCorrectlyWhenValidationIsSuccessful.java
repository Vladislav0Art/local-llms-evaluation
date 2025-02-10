package com.adobe.epubcheck.opf;

public class GeneratedCheckItemAfterResourceValidationChecksItemCorrectlyWhenValidationIsSuccessful {

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
    public void checkItemAfterResourceValidationChecksItemCorrectlyWhenValidationIsSuccessful() throws Exception {
        OPFItem item = new OPFItem();
        opfChecker30.checkItemAfterResourceValidation(item);
        Assert.assertTrue(context.isValidationSuccessful());
    }

}