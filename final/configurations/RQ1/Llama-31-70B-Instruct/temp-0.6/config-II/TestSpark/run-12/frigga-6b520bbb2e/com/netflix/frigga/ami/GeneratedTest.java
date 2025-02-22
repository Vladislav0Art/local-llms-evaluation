package com.netflix.frigga.ami;

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedName.getPackageName());
    }

    @Test
    public void testCompareTo() {
        AppVersion other = new AppVersion();
        other.setPackageName("subscriberha");
        other.setVersion("1.0.0");
        other.setBuildJobName("WE-WAPP-subscriberha");
        other.setBuildNumber("586499");
        other.setCommit("h150");
        int comparison = appVersion.compareTo(other);
        assertEquals(0, comparison);
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void testGetPackageName() {
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        assertNull(appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void testGetChangelist() {
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void testGetCommit() {
        assertNull(appVersion.getCommit());
    }

}