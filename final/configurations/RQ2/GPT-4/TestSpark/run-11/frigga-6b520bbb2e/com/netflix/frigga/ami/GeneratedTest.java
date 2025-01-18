package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedTest {

    @Test
    public void parseName_HappyScenario_Test() {
        String amiName = "testname";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion, is(notNullValue()));
    }

    @Test
    public void compareTo_HappyScenario_Test() {
        AppVersion appVersion1 = AppVersion.parseName("testname1");
        AppVersion appVersion2 = AppVersion.parseName("testname2");
        int result = appVersion1.compareTo(appVersion2);
        assertThat(result, not(0));
    }

    @Test
    public void getAppVersionPattern_HappyScenario_Test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertThat(pattern, is(notNullValue()));
    }

    @Test
    public void getPackageName_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String packageName = appVersion.getPackageName();
        assertThat(packageName, not(isEmptyOrNullString()));
    }

    @Test
    public void getVersion_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String version = appVersion.getVersion();
        assertThat(version, not(isEmptyOrNullString()));
    }

    @Test
    public void getBuildJobName_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String buildJobName = appVersion.getBuildJobName();
        assertThat(buildJobName, not(isEmptyOrNullString()));
    }

    @Test
    public void getBuildNumber_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String buildNumber = appVersion.getBuildNumber();
        assertThat(buildNumber, not(isEmptyOrNullString()));
    }

    @Test
    public void getCommit_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String commit = appVersion.getCommit();
        assertThat(commit, not(isEmptyOrNullString()));
    }

    @Test
    public void getChangelist_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String changelist = appVersion.getChangelist();
        assertThat(changelist, not(isEmptyOrNullString()));
    }

    @Test
    public void toString_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String stringAppVersion = appVersion.toString();
        assertNotNull(stringAppVersion);
    }

    @Test
    public void hashCode_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        int hashCode = appVersion.hashCode();
        assertThat(hashCode, not(0));
    }

    @Test
    public void equals_HappyScenario_Test() {
        AppVersion appVersion1 = AppVersion.parseName("testname");
        AppVersion appVersion2 = AppVersion.parseName("testname");
        assertTrue(appVersion1.equals(appVersion2));
    }

}