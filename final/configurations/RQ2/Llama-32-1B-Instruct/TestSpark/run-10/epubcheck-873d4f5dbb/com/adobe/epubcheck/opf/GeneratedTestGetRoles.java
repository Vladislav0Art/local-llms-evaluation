package com.adobe.epubcheck.opf;

public class GeneratedTestGetRoles {

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
    public void testGetRoles() {
        mockObject = new OPFChecker30(mockEPUBLocation);
        expectTrue(isAudioType("audio"));
        expectTrue(isVideoType("video"));
        expectTrue(isBlessedAudioType("audio"));
        expectTrue(isBlessedVideoType("video"));
        expectTrue(isCommonVideoType("video"));
        expectTrue(isFontType("font"));
        // Add other tests here
    }

}