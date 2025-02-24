package com.adobe.epubcheck.opf;

public class GeneratedTestCheckSpineItem {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testCheckSpineItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        checker.checkSpineItem(item, opfHandler);
    }

}