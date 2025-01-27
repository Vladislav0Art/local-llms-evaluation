package com.adobe.epubcheck.opf;

public class GeneratedCheckItem_WithValidItem_andNoErrors_ShouldReturnFalse {

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
    public void checkItem_WithValidItem_andNoErrors_ShouldReturnFalse() {
        OPFItem item = new OPFItem();
        assertFalse(checker.checkItem(item, null));
    }

}