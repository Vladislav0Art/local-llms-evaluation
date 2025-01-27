package com.adobe.epubcheck.opf;

public class GeneratedCheckItem_NullItem_ShouldThrowNullPointerException {

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
    public void checkItem_NullItem_ShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> checker.checkItem(null));
    }

}