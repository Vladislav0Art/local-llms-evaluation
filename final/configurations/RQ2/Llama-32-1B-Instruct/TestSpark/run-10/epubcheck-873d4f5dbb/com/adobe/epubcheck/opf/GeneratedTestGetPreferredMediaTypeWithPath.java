package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaTypeWithPath {

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
    public void testGetPreferredMediaTypeWithPath() {
        mockObject = new OPFChecker30(mockEPUBLocation);
        expectTrue(getPreferredMediaType("audio", "path"));
        expectTrue(getPreferredMediaType("video", "path"));
        expectTrue(getPreferredMediaType("commonVideo", "path"));
        // Add other tests here
    }

}