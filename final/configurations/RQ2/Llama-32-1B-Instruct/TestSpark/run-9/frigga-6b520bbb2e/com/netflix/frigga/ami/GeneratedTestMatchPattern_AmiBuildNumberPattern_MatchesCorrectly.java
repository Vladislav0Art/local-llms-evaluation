package com.netflix.frigga.ami;

public class GeneratedTestMatchPattern_AmiBuildNumberPattern_MatchesCorrectly {

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
    public void testMatchPattern_AmiBuildNumberPattern_MatchesCorrectly() {
        assertTrue(generatedTest.matchPattern(NameConstants.AMiBuildNumberPattern, NameConstants.AmiVersionPattern));
    }

}