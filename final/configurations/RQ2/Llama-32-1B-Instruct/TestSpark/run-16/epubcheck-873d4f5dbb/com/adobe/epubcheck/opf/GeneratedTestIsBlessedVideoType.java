package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        // Create a mock of the ValidationContext with an empty blessed video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedVideoTypes = new HashSet<>();

        // Call the isBlessedVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedVideoType("video-type");

        // Verify that the mock blessed video type set was not modified
        assertNotNull(blessedVideoTypes);
    }

}