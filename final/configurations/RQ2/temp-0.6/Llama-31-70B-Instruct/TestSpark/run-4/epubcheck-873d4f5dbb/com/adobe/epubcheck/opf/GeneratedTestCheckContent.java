package com.adobe.epubcheck.opf;

public class GeneratedTestCheckContent {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testCheckContent() {
        assertFalse(checker.checkContent());
    }

}