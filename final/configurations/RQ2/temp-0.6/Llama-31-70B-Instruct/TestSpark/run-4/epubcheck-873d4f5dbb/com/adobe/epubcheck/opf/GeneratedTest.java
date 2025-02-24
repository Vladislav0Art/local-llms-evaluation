package com.adobe.epubcheck.opf;

public class GeneratedTest {

    private OPFChecker30 checker;

    @Before
    public void setup() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        checker = new OPFChecker30(context);
    }

    @Test
    public void testInitHandler() {
        checker.initHandler();
    }

    @Test
    public void testCheckPackage() {
        assertFalse(checker.checkPackage());
    }

    @Test
    public void testCheckContent() {
        assertFalse(checker.checkContent());
    }

    @Test
    public void testCheckItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        checker.checkItem(item, opfHandler);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFItem item = Mockito.mock(OPFItem.class);
        checker.checkItemAfterResourceValidation(item);
    }

    @Test
    public void testCheckSpineItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        checker.checkSpineItem(item, opfHandler);
    }

    @Test
    public void testIsAudioType() {
        assertFalse(OPFChecker30.isAudioType(""));
    }

    @Test
    public void testIsBlessedAudioType() {
        assertFalse(OPFChecker30.isBlessedAudioType(""));
    }

    @Test
    public void testIsVideoType() {
        assertFalse(OPFChecker30.isVideoType(""));
    }

}