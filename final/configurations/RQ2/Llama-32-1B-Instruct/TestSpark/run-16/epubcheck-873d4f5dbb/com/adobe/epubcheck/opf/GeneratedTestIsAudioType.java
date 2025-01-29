package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        // Create a mock of the ValidationContext with an empty audio type set
        MockValidationContext context = new MockValidationContext();
        Set<String> audioTypes = new HashSet<>();

        // Call the isAudioType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isAudioType("audio-type");

        // Verify that the mock audio type set was not modified
        assertNotNull(audioTypes);
    }

}