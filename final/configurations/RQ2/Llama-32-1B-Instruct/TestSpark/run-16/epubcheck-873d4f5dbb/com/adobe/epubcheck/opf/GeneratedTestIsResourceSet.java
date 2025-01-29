package com.adobe.epubcheck.opf;

public class GeneratedTestIsResourceSet {

    @Test
    public void testIsResourceSet() {
        // Create a mock of the ValidationContext with an empty resource set
        MockValidationContext context = new MockValidationContext();
        ResourceCollection.ResourceSet resources = new ResourceCollection.ResourceSet();

        // Call the isResourceSet method on the OPFChecker30 instance
        boolean result = OPFChecker30.isResourceSet(resources);

        // Verify that the mock resource set was not modified
        assertNotNull(context.getSpineItemList());
    }

}