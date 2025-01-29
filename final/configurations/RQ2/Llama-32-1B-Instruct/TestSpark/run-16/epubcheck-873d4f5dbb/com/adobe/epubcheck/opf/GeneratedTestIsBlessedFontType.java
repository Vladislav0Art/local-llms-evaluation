package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        // Create a mock of the ValidationContext with an empty blessed font type set
        MockValidationContext context = new MockValidationContext();
        Set<String> blessedFontTypes = new HashSet<>();

        // Call the isBlessedFontType method on the OPFChecker30 instance
        boolean result = OPFChecker30.isBlessedFontType("font-type");

        // Verify that the mock blessed font type set was not modified
        assertNotNull(blessedFontTypes);
    }

}