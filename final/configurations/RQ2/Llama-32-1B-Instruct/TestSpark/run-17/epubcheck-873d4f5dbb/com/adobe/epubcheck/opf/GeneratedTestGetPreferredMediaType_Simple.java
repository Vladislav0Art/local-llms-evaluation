package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_Simple {

    private MockOPFChecker30 mockOPFChecker30;
    private ValidatingContext validatingContext;

    @Before
    public void setUp() {
        validatingContext = new ValidatingContext();
        validReferences = new Set<>();
        validURLFragments = new URLFragment();
        validEPUBLocations = new EPUBLocation();
        validFeatureReports = new FeatureReport();
        validMetadataSets = new MetadataSet();
        validResources = new ResourceCollection();
        validRoles = new Roles();
    }

    private Optional<Reference> validReference() {
        return Optional.of(new Reference(validURLFragments, validEPUBLocations, validFeatureReports));
    }

    @Test
    public void testGetPreferredMediaType_Simple() {
        validReference().ifPresent(reference -> {
            assertEquals("test", mockOPFChecker30.getPreferredMediaType(reference.getType(), "test"));
        });
    }

}