package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testIsVideoType() {
        assertFalse(OPFChecker30.isVideoType(""));
    }

}