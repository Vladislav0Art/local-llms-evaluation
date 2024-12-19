package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTest {

    @Mock
    private String amiName;

    @Test
    public void testParseName() {
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result, is(null));
    }

    @Test
    public void testParseNameWithValidInput() {
        AppVersion result = AppVersion.parseName("123 package 1.2.3");
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is("1.2.3"));
        assertThat(result.getBuildJobName(), is(null));
        assertThat(result.getBuildNumber(), is(null));
        assertThat(result.getCommit(), is(null));
    }

    @Test
    public void testParseNameWithNoVersion() {
        AppVersion result = AppVersion.parseName("123 package");
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is(null));
        assertThat(result.getBuildJobName(), is(null));
        assertThat(result.getBuildNumber(), is(null));
        assertThat(result.getCommit(), is(null));
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertThat(pattern, is(Pattern.compile("\\d+\\.\\d+\\.\\d+")));
    }

    @Test
    public void testCompareToDifferentVersions() {
        AppVersion version1 = new AppVersion("1.2.3");
        AppVersion version2 = new AppVersion("4.5.6");
        int result = version1.compareTo(version2);
        assertThat(result, is(-1));
    }

    @Test
    public void testCompareToSameVersions() {
        AppVersion version1 = new AppVersion("1.2.3");
        AppVersion version2 = new AppVersion("1.2.3");
        int result = version1.compareTo(version2);
        assertThat(result, is(0));
    }

    @Test
    public void testGetPackageNameAndVersion() {
        String amiName = "123 package 1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is("1.2.3"));
    }

    @Test
    public void testGetBuildJobNameAndNumber() {
        String amiName = "123 package 1.2.3 build-123";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getBuildJobName(), is("build-123"));
        assertThat(result.getBuildNumber(), is("123"));
    }

    @Test
    public void testGetCommit() {
        String amiName = "123 package 1.2.3 commit-abc";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getCommit(), is("commit-abc"));
    }

    @Test
    public void testGetBuildNumber() {
        String amiName = "123 package 1.2.3 build-123";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getBuildNumber(), is("123"));
    }

    @Test
    public void testGetChangelist() {
        String amiName = "123 package 1.2.3 changelist-abc";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getChangelist(), is("changelist-abc"));
    }

}