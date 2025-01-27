package com.adobe.epubcheck.opf;

public class GeneratedCheckPackage_WithoutErrors_ShouldReturnFalse {

    private OPFChecker30 checker;

    @Before
    public void init() {
        ValidationContext context = new ValidationContext();
        checker = new OPFChecker30(context);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void checkPackage_WithoutErrors_ShouldReturnFalse() {
        assertFalse(checker.checkPackage());
    }

}