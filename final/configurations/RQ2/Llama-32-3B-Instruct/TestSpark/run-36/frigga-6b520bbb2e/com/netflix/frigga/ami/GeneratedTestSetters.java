package com.netflix.frigga.ami;

public class GeneratedTestSetters {

    // add your implementation here
}

public class AppVersion {

    private String buildNumber;
    private String commit;
    private String jobId;

    public static Pattern getAppVersionPattern() {
        return new Pattern();
    }

    public static AppVersion parseName(String name) {
        // implement your logic here
        return new AppVersion();
    }

    public void setBuildNumber(int number) {
        this.buildNumber = Integer.toString(number);
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}

public class GeneratedTest {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void testSetters() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber(123);
        appVersion.setCommit("commit");
        appVersion.setJobId("jobId");
        assertEquals(123, Integer.parseInt(appVersion.getBuildNumber()));
        assertEquals("commit", appVersion.getCommit());
        assertEquals("jobId", appVersion.getJobId());
    }
}

}