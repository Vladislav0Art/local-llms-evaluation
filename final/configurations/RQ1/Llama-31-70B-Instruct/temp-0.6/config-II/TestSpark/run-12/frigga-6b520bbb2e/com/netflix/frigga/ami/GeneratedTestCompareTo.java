package com.netflix.frigga.ami;

public class GeneratedTestCompareTo {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
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

}