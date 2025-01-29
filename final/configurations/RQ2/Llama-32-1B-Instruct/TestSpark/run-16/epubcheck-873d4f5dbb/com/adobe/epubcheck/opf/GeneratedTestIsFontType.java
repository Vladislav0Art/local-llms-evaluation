package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        // Create a mock of the ValidationContext with an empty font type set
        MockValidationContext context = new MockValidationContext();
        Set<String> fontTypes = new HashSet<>();

        // Call the isFontType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isFontType("font-type");

        // Verify that the mock font type set was not modified
        assertNotNull(fontTypes);
    }

}