package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedAudioType_MpegType_ShouldReturnTrue {

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
    public void isBlessedAudioType_MpegType_ShouldReturnTrue() {
        String type = "application/MP3+html";
        assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

}