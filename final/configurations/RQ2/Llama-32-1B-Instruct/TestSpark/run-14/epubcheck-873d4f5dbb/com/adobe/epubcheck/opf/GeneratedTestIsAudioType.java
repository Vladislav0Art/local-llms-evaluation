package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    private MockOPFChecker30 mockOpfChecker;

    @Before
    public void setup() {
        mockOpfChecker = new MockOPFChecker30();
    }

    @Test
    public void testIsAudioType() {
        Optional<String> result = mockOpfChecker.isAudioType("audio");
        assertTrue(result.isPresent());
        assertEquals("audio", result.get());
    }

}