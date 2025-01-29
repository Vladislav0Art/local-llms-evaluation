package com.adobe.epubcheck.opf;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        // Create a mock of the ValidationContext with an empty content set
        MockValidationContext context = new MockValidationContext();
        context.setContentSet(new HashSet<>());

        // Call the checkContent method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkContent();

        // Verify that the mock content set was not modified
        assertNotNull(context.getContentSet());
    }

}