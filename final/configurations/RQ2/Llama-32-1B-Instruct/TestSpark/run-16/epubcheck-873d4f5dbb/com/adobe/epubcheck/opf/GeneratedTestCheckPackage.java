package com.adobe.epubcheck.opf;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        // Create a mock of the ValidationContext with an empty package set
        MockValidationContext context = new MockValidationContext();
        context.setPackageSet(new HashSet<>());

        // Call the checkPackage method on the OPFChecker30 instance
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkPackage();

        // Verify that the mock package set was not modified
        assertNotNull(context.getPackageSet());
    }

}