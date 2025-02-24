package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testIsAudioType() {
        assertFalse(OPFChecker30.isAudioType(""));
    }

}