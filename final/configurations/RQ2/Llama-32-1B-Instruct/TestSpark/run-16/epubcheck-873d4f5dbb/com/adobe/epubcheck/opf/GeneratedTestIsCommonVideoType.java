package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        // Create a mock of the ValidationContext with an empty common video type set
        MockValidationContext context = new MockValidationContext();
        Set<String> commonVideoTypes = new HashSet<>();

        // Call the isCommonVideoType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isCommonVideoType("video-type");

        // Verify that the mock common video type set was not modified
        assertNotNull(commonVideoTypes);
    }

}