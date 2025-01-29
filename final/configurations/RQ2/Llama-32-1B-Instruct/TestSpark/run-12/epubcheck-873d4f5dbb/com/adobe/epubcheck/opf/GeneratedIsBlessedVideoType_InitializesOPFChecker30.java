package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedVideoType_InitializesOPFChecker30 {

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
    public void isBlessedVideoType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedVideoType("video/mp4"));
        assertFalse(checker.isBlessedVideoType("image/jpeg"));

        verifyAllMethods();
    }

}