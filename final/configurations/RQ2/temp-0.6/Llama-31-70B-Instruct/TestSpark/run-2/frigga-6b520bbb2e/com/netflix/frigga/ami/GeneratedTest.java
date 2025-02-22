package com.netflix.frigga.ami;

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @After
    public void tearDown() {
        appVersion = null;
    }

    @Test
    public void testParseName() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void testCompareTo() {
        AppVersion other = new AppVersion();
        assertEquals(0, appVersion.compareTo(other));
    }

    @Test
    public void testNullSafeStringComparator() {
        assertEquals(0, appVersion.nullSafeStringComparator(null, null));
    }

    @Test
    public void testGetAppVersionPattern() {
        assertNotNull(AppVersion.getAppVersionPattern());
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
    public void testGetCommit() {
        assertNull(appVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void testToString() {
        assertEquals("AppVersion [packageName=null, version=null, buildJobName=null, buildNumber=null, changelist=null]", appVersion.toString());
    }

    @Test
    public void testHashCode() {
        assertEquals(1, appVersion.hashCode());
    }

}