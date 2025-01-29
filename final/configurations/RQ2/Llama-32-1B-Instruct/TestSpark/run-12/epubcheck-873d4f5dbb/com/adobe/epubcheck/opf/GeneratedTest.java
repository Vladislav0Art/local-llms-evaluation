package com.adobe.epubcheck.opf;

public class GeneratedTest {

    private MockReferenceChecker30 referenceChecker;
    private MockOverlayTextChecker overlayTextChecker;
    private MockSmilClockChecker smilClockChecker;

    @BeforeEach
    public void init() {
        this.referenceChecker = new MockReferenceChecker30();
        this.overlayTextChecker = new MockOverlayTextChecker();
        this.smilClockChecker = new MockSmilClockChecker();
    }

    @Test
    public void checkPackage_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();
        checker.checkPackage();

        verifyAllMethods();
    }

    @Test
    public void checkContent_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();
        checker.checkContent();

        verifyAllMethods();
    }

    @Test
    public void checkItem_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();
        OPFItem item = new OPFItem("test", "text/plain");
        checker.checkItem(item, null);

        verifyAllMethods();
    }

    @Test
    public void checkSpineItem_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();
        OPFItem item = new OPFItem("test", "text/plain");
        checker.checkSpineItem(item, null);

        verifyAllMethods();
    }

    @Test
    public void checkItemAfterResourceValidation_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();
        OPFItem item = new OPFItem("test", "text/plain");
        checker.checkItem(item, null);

        verifyAllMethods();
    }

    @Test
    public void isAudioType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isAudioType("audio/mpeg"));
        assertFalse(checker.isAudioType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isBlessedAudioType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedAudioType("audio/mpeg"));
        assertFalse(checker.isBlessedAudioType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isVideoType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isVideoType("video/mp4"));
        assertFalse(checker.isVideoType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isBlessedVideoType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedVideoType("video/mp4"));
        assertFalse(checker.isBlessedVideoType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isCommonVideoType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isCommonVideoType("video/mp4"));
        assertFalse(checker.isCommonVideoType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isFontType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isFontType("application/x-font"));
        assertFalse(checker.isFontType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isBlessedFontType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedFontType("application/x-font"));
        assertFalse(checker.isBlessedFontType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isBlessedScriptType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedScriptType("application/x-font"));
        assertFalse(checker.isBlessedScriptType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void isCoreMediaType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isCoreMediaType("application/ogg"));
        assertFalse(checker.isCoreMediaType("image/jpeg"));

        verifyAllMethods();
    }

    @Test
    public void getPreferredMediaType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        String path = "/path/to/file";
        String type = "application/ogg";

        String preferredMediaType = checker.getPreferredMediaType(type, path);

        verifyAllMethods();
    }

}