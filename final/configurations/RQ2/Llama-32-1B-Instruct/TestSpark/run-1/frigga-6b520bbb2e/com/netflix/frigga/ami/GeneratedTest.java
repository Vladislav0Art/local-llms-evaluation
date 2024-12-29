package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest {

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
    public void testParseName() {
        appVersion = AppVersion.parseName("ami-name-123");
        matcher = getAppVersionPattern();
        while (matcher.find()) {
            assertEquals(expectedPackage, matcher.group(1));
            matcher.reset();
            matcher = getAppVersionPattern();
            while (matcher.find()) {
                assertEquals(expectedVersion, matcher.group(1));
                matcher.reset();
                matcher = getAppVersionPattern();
                while (matcher.find()) {
                    assertEquals(expectedBuildJobName, matcher.group(1));
                    matcher.reset();
                    matcher = getAppVersionPattern();
                    while (matcher.find()) {
                        assertEquals(expectedBuildNumber, matcher.group(1));
                        matcher.reset();
                        matcher = getAppVersionPattern();
                        while (matcher.find()) {
                            assertEquals(expectedCommit, matcher.group(1));
                            matcher.reset();
                            matcher = getAppVersionPattern();
                            while (matcher.find()) {
                                assertEquals(expectedChangelist, matcher.group(1));
                            }
                        }
                    }
                }
            }
        }
    }

    @Test
    public void testGetPackageName() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_NAME_PACKAGE_NAME, appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_VERSION_VERSION_NUMBER, appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_BUILD_JOB_NAME_BUILD_JOB_NAME, appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_BUILD_NUMBER_BUILD_NUMBER, appVersion.getVersion());
    }

    @Test
    public void testGetCommit() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_COMMIT_COMMIT, appVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        appVersion = AppVersion.parseName("ami-name-123");
        assertEquals(AppConstants.AMI_CHANGELIST_CHANGE_LIST, appVersion.getChangelist());
    }

}