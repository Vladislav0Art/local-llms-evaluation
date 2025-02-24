package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItemAfterResourceValidation {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFItem item = Mockito.mock(OPFItem.class);
        checker.checkItemAfterResourceValidation(item);
    }

}