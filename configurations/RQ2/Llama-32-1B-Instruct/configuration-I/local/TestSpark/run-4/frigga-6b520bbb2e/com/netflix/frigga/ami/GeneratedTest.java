package com.netflix.frigga.ami;

public class GeneratedTest {

    private static String amiName;

    @Test
    public void TestParseName() {
        amitest("ami123", "version1");
    }

    @Test
    public void TestCompareTo() {
        appVersion = new AppVersion();
        appVersion.compareTo(appVersion2);
        assertEquals(0, appVersion.compareTo(appVersion2));
    }

    @MockBean
    private Pattern pattern;

    @MockBean
    private AppVersion parseName;

    @Before
    public void setup() {
        when(parseName.amiName()).thenReturn(amiName);
    }

    @Test
    public void TestGetAppVersionPattern() {
        when(pattern.matches(" ami.*:.* "));
        verifyNoInteractions(pattern);
    }

    @Test
    public void TestGetPackageName() {
        when(parseName.amiName()).thenReturn("package1");
        assertEquals("package1", appVersion.getPackageName());
    }

    @Test
    public void TestGetVersion() {
        when(parseName.amiName()).thenReturn("version1");
        assertEquals("version1", appVersion.getVersion());
    }

    @Test
    public void TestGetBuildJobName() {
        when(parseName.amiName()).thenReturn("job1");
        assertEquals("job1", appVersion.getBuildJobName());
    }

    @Test
    public void TestGetBuildNumber() {
        when(parseName.amiName()).thenReturn("build1");
        assertEquals("build1", appVersion.getBuildNumber());
    }

    @Test
    public void TestGetCommit() {
        when(parseName.amiName()).thenReturn("commit1");
        assertEquals("commit1", appVersion.getCommit());
    }

    @BeforeClass
    public static void init() {
        amitest("", "");
    }

    private void amitest(String ami, String version) {
        appVersion = new AppVersion();
        amitest(ami, version);
    }

}