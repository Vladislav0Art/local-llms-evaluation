package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName_MockAppVersion_getsCorrectValue {

    private String packageName;
    private String version;

    public AppVersion(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }
}

public class TestSpark {

    @Mock
    private AmiVersion amiVersion;

    @InjectMocks
    private GeneratedTest generatedTest;

    @BeforeAll
    public void setup() {
        // Setup mocks here
    }

    @AfterAll
    public void tearDown() {
        // Teardown mocks here
    }

    @Test
    public void testGetBuildJobName_MockAppVersion_getsCorrectValue() {
        when(amiVersion.getBuildJobName()).thenReturn("build-123");
        assertEquals("build-123", amiVersion.getBuildJobName());
    }

}