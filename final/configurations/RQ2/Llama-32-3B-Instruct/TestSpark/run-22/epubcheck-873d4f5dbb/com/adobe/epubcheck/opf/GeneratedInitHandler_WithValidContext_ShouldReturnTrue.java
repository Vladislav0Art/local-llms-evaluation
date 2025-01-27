package com.adobe.epubcheck.opf;

public class GeneratedInitHandler_WithValidContext_ShouldReturnTrue {

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
    public void initHandler_WithValidContext_ShouldReturnTrue() {
        assertTrue(checker.initHandler());
    }

}