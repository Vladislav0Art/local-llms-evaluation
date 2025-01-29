package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    @Test
    public void testParseName() {
        String amiName = "ami-12345678-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion.getPackageName(), is("ami-12345678"));
        assertThat(appVersion.getVersion(), is("abcde"));
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("");
        assertThat(matcher.find(), is(true));
    }

    @Test
    public void testGetPackageName() {
        String[] args = {"ami-12345678", "xyz"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getPackageName(), is(args[0]));
        assertThat(appVersion.getVersion(), is(null));
    }

    @Test
    public void testGetVersion() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getVersion(), is(args[0]));
        assertThat(appVersion.getBuildNumber(), is(null));
    }

    @Test
    public void testGetBuildJobName() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getBuildJobName(), is(args[0]));
        assertThat(appVersion.getBuildNumber(), is(null));
    }

    @Test
    public void testGetBuildNumber() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getBuildNumber(), is(args[0]));
        assertThat(appVersion.getCommit(), is(null));
    }

    @Test
    public void testGetCommit() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getCommit(), is(args[0]));
        assertThat(appVersion.getBuildJobName(), is(null));
    }

    @Test
    public void testGetChangelist() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getChangelist(), is(args[0]));
        assertThat(appVersion.getBuildJobName(), is(null));
    }

    @Test
    public void testToString() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.toString(), is(args[0]));
        assertThat(appVersion.hashCode(), is(0));
    }

    @Test
    public void testEquals() {
        String[] args1 = {"ami-12345678", "abcde"};
        String[] args2 = {"ami-12345679", "defgh"};

        AppVersion appVersion1 = new AppVersion("ami-12345678");
        AppVersion appVersion2 = new AppVersion("ami-12345678");

        assertThat(appVersion1.equals(appVersion2), is(false));

        AppVersion appVersion3 = new AppVersion("ami-12345679");
        AppVersion appVersion4 = new AppVersion("ami-12345678");

        assertThat(appVersion1.equals(appVersion3), is(true));
    }

}