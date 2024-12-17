package com.netflix.frigga.ami;

public class GeneratedTestToString {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToString() throws Exception {
        String amiName = "subscriberha-1.0.0-586499";
        appVersion = AppVersion.parseName(amiName);
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0-586499, buildJobName=jenkins-job, buildNumber=1, changelist=],", appVersion.toString());
    }

}