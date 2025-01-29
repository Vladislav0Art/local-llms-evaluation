package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaType_InitializesOPFChecker30 {

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
    public void getPreferredMediaType_InitializesOPFChecker30() {
        OPFChecker30 checker = new OPFChecker30(null);
        checker.initHandler();

        String path = "/path/to/file";
        String type = "application/ogg";

        String preferredMediaType = checker.getPreferredMediaType(type, path);

        verifyAllMethods();
    }

}