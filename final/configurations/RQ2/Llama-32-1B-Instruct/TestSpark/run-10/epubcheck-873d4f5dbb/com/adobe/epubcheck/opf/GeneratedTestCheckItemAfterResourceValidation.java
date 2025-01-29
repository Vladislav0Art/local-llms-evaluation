package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItemAfterResourceValidation {

    private MockObject mockObject;
    private MockReference reference;

    @Mocked
    public FeatureReport getFeatureReport() {
        return new MockFeatureReport();
    }

    @Mocked
    public EPUBLocation getEPUBLocation() {
        return new MockEPUBLocation();
    }

    @Mocked
    public Feature getFeature(String name) {
        return new MockFeature(name);
    }

    @Mocked
    public MetadataSet getMetadataSet() {
        return new MockMetadataSet();
    }

    @Mocked
    public Set<String> getRoles() {
        return new MockRoles();
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        mockObject = new OPFChecker30(mockEPUBLocation);
        expectTrue(isBlessedAudioType("audio"));
        checkSpineItem(new MockOPFItem(), mockObject.getHandler());
        // Add other tests here
    }

}