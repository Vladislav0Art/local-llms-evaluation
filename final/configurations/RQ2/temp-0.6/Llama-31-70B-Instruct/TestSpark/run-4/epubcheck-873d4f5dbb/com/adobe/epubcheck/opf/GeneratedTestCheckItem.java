package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItem {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testCheckItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        checker.checkItem(item, opfHandler);
    }

}