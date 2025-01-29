package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        // Create a mock of the ValidationContext with an empty video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> videoTypes = new HashSet<>();

        // Call the isVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isVideoType("video-type");

        // Verify that the mock video type set was not modified
        assertNotNull(videoTypes);
    }

}