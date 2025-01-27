package com.adobe.epubcheck.opf;

public class GeneratedTest {

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
    public void initHandler_WithValidContext_ShouldReturnTrue() {
        assertTrue(checker.initHandler());
    }

    @Test
    public void checkPackage_WithoutErrors_ShouldReturnFalse() {
        assertFalse(checker.checkPackage());
    }

    @Test
    public void checkContent_WithErrors_ShouldReturnTrue() {
        checker.addError("error", "message");
        assertTrue(checker.checkContent());
    }

    @Test
    public void checkItem_NullItem_ShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> checker.checkItem(null));
    }

    @Test
    public void checkItem_WithValidItem_andNoErrors_ShouldReturnFalse() {
        OPFItem item = new OPFItem();
        assertFalse(checker.checkItem(item, null));
    }

    @Test
    public void isAudioType_AudioFileExtension_ShouldReturnTrue() {
        String type = "audio/mpeg";
        assertTrue(OPFChecker30.isAudioType(type));
    }

    @Test
    public void isBlessedAudioType_MpegType_ShouldReturnTrue() {
        String type = "application/MP3+html";
        assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

    @Test
    public void isVideoType_VideoFileExtension_ShouldReturnTrue() {
        String type = "video/mp4";
        assertTrue(OPFChecker30.isVideoType(type));
    }

    @Test
    public void isCommonVideoType_MpegType_ShouldReturnTrue() {
        String type = "application/MP3+html";
        assertTrue(OPFChecker30.isCommonVideoType(type));
    }

    @Test
    public void isFontType_TtfFileExtension_ShouldReturnTrue() {
        String type = "application/x-ttf";
        assertTrue(OPFChecker30.isFontType(type));
    }

    @Test
    public void isBlessedFontType_Woff2Type_ShouldReturnTrue() {
        String type = "application/woff2";
        assertTrue(OPFChecker30.isBlessedFontType(type));
    }

    @Test
    public void getPreferredMediaType_NullPath_ShouldThrowNullPointerException() {
        String type = "video/mp4";
        assertThrows(NullPointerException.class, () -> OPFChecker30.getPreferredMediaType(type, null));
    }
}

public class ValidationContext {

}

public class OPFItem implements OPFItemInterface {

    public static final int STATUS_OK = 0;

    @Override
    public int getStatus() {
        return STATUS_OK;
    }

    @Override
    public void setStatus(int status) {
    }

    @Override
    public String toString() {
        return "OPFItem";
    }
}

}