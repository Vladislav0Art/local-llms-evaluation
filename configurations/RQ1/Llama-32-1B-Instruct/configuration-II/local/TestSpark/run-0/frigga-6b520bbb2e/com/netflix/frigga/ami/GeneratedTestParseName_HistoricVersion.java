package com.netflix.frigga.ami;

public class GeneratedTestParseName_HistoricVersion {

    @Test
    public void testParseName_HistoricVersion() {
        String buildJobName = "build-job-name";
        String version = "h1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-" + version);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(version, parsedVersion.getVersion());
    }

}