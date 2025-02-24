package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testIsBlessedAudioType() {
        assertFalse(OPFChecker30.isBlessedAudioType(""));
    }

}