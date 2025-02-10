package com.adobe.epubcheck.opf;

public class GeneratedTestSpineItem {

    private static final int AUDIO_TYPE = 1;
    private static final int VIDEO_TYPE = 2;

    @Test
    public void testSpineItem() throws Exception {
        OPFChecker30 opfChecker = new OPFChecker30();
        opfChecker.checkSpineItem(null, null);

        opfChecker = new OPFChecker30();
        opfChecker.checkSpineItem("spine", "manifest.json");
    }

}