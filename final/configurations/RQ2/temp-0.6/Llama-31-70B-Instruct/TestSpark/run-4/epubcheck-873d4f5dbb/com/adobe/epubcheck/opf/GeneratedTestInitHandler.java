package com.adobe.epubcheck.opf;

public class GeneratedTestInitHandler {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testInitHandler() {
        checker.initHandler();
    }

}