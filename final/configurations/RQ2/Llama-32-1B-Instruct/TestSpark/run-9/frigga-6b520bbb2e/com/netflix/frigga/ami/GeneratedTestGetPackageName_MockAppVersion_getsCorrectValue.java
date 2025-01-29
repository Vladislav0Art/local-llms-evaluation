package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName_MockAppVersion_getsCorrectValue {

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
    public void testGetPackageName_MockAppVersion_getsCorrectValue() {
        when(amiVersion.getPackageName()).thenReturn("com.example.app");
        assertEquals("com.example.app", amiVersion.getPackageName());
    }

}