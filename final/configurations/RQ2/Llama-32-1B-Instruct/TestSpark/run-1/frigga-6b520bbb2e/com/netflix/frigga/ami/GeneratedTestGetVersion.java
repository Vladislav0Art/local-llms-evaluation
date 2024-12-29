package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetVersion {

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
    public void testGetVersion() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_VERSION_VERSION_NUMBER, appVersion.getVersion());
    }

}