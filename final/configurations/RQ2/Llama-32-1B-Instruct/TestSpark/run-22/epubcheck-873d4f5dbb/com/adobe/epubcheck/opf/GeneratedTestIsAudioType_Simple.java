package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsAudioType_Simple() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isAudioType(type);
        assertEquals(true, result);
    }

}