package com.adobe.epubcheck.opf;

public class GeneratedCheckItemChecksItemCorrectlyWhenValidationIsSuccessful {

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
    public void checkItemChecksItemCorrectlyWhenValidationIsSuccessful() throws Exception {
        OPFItem item = new OPFItem();
        opfChecker30.checkItem(item, new OPFHandler());
        Assert.assertTrue(context.isValidationSuccessful());
    }

}