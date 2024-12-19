package com.netflix.frigga.ami;

public class GeneratedTestParseName_CommitIdAfterBuildNumber {

    @Test
    public void testParseName_CommitIdAfterBuildNumber() {
        String buildJobName = "build-job-name";
        String commit = "12345";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-1.0.0-" + buildJobName + "-" + commit);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(commit, parsedVersion.getCommit());
    }

}