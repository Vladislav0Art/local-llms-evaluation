package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedScriptType_InitializesOPFChecker30 {

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
    public void isBlessedScriptType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        assertTrue(checker.isBlessedScriptType("application/x-font"));
        assertFalse(checker.isBlessedScriptType("image/jpeg"));

        verifyAllMethods();
    }

}