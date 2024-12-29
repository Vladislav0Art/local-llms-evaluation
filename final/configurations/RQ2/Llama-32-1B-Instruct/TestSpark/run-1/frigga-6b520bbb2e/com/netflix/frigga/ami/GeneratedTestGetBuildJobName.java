package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetBuildJobName {

    @Mock
    private Pattern getAppVersionPattern() throws Exception;

    private Matcher matcher;
    private String expectedPackage;
    private String expectedVersion;
    private String expectedBuildJobName;
    private String expectedBuildNumber;
    private String expectedCommit;
    private String expectedChangelist;

    @Test
    public void testGetBuildJobName() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_BUILD_JOB_NAME_BUILD_JOB_NAME, appVersion.getBuildJobName());
    }

}