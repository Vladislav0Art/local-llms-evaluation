package com.adobe.epubcheck.opf;

public class GeneratedCheckContentReturnsFalseWhenValidationFails {

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
    public void checkContentReturnsFalseWhenValidationFails() {
        context.setValidationError("Invalid content");
        Assert.assertFalse(opfChecker30.checkContent());
    }

}