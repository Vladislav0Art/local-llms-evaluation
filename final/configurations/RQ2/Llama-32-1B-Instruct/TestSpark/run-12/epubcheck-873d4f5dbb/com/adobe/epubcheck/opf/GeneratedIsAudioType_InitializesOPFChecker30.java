package com.adobe.epubcheck.opf;

public class GeneratedIsAudioType_InitializesOPFChecker30 {

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
    public void isAudioType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isAudioType("audio/mpeg"));
        assertFalse(checker.isAudioType("image/jpeg"));

        verifyAllMethods();
    }

}