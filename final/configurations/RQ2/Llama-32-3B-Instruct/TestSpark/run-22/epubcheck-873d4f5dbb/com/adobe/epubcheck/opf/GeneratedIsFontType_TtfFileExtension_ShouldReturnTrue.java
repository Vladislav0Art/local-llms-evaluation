package com.adobe.epubcheck.opf;

public class GeneratedIsFontType_TtfFileExtension_ShouldReturnTrue {

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
    public void isFontType_TtfFileExtension_ShouldReturnTrue() {
        String type = "application/x-ttf";
        assertTrue(OPFChecker30.isFontType(type));
    }

}