package com.adobe.epubcheck.opf;

public class GeneratedCheckContent_WithErrors_ShouldReturnTrue {

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
    public void checkContent_WithErrors_ShouldReturnTrue() {
        checker.addError("error", "message");
        assertTrue(checker.checkContent());
    }

}