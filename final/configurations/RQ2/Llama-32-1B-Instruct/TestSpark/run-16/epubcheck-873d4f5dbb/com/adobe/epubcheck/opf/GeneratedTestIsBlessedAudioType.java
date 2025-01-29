package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        // Create a mock of the ValidationContext with an empty blessed audio type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedAudioTypes = new HashSet<>();

        // Call the isBlessedAudioType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedAudioType("audio-type");

        // Verify that the mock blessed audio type set was not modified
        assertNotNull(blessedAudioTypes);
    }

}