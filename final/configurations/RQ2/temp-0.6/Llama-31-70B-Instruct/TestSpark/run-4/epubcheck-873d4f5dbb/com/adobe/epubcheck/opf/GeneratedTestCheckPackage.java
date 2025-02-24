package com.adobe.epubcheck.opf;

public class GeneratedTestCheckPackage {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testCheckPackage() {
        assertFalse(checker.checkPackage());
    }

}