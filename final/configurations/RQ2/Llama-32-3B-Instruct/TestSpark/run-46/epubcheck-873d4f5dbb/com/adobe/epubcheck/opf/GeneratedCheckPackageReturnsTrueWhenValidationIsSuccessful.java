package com.adobe.epubcheck.opf;

public class GeneratedCheckPackageReturnsTrueWhenValidationIsSuccessful {

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
    public void checkPackageReturnsTrueWhenValidationIsSuccessful() {
        opfChecker30.checkPackage();
        Assert.assertTrue(context.isValidationSuccessful());
    }

}