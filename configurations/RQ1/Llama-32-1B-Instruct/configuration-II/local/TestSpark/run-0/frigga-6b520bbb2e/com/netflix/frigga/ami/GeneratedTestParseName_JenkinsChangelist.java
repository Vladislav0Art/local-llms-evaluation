package com.netflix.frigga.ami;

public class GeneratedTestParseName_JenkinsChangelist {

    @Test
    public void testParseName_JenkinsChangelist() {
        String buildJobName = "build-job-name";
        String commit = "12345";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-1.0.0-" + buildJobName + "-" + commit);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(commit, parsedVersion.getCommit());
    }

}