package com.adobe.epubcheck.opf;

public class GeneratedIsVideoType_VideoFileExtension_ShouldReturnTrue {

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
    public void isVideoType_VideoFileExtension_ShouldReturnTrue() {
        String type = "video/mp4";
        assertTrue(OPFChecker30.isVideoType(type));
    }

}