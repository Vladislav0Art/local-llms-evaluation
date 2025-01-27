package com.adobe.epubcheck.opf;

public class GeneratedIsAudioType_AudioFileExtension_ShouldReturnTrue {

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
    public void isAudioType_AudioFileExtension_ShouldReturnTrue() {
        String type = "audio/mpeg";
        assertTrue(OPFChecker30.isAudioType(type));
    }

}