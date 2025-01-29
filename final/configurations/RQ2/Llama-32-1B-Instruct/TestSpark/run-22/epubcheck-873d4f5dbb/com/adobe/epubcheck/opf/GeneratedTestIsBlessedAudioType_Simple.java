package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedAudioType_Simple() {
        String type = "application/binary-mpeg";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertEquals(false, result);
    }

}