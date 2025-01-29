package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    private MockOPFChecker30 mockOpfChecker;

    @Before
    public void setup() {
        mockOpfChecker = new MockOPFChecker30();
    }

    @Test
    public void testIsBlessedAudioType() {
        Optional<String> result = mockOpfChecker.isBlessedAudioType("audio");
        assertTrue(result.isPresent());
        assertEquals("audio", result.get());
    }

}