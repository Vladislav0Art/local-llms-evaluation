package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedTest {

    @Test
    public void parseName_ReturnsParsedAppVersion_WhenAmitrue() {
        String amiName = "ami-true";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion, is(AppVersion.THRUE));
    }

    @Test
    public void parseName_ThrowsException_WhenAmitrueNotFound() {
        String amiName = "ami-false";
        AppVersion appVersion = null;
        try {
            AppVersion.parseName(amiName);
            assert false : "Expected exception was not thrown";
        } catch (Exception e) {
        }
    }

    @Test
    public void getPackageName_ReturnsCorrectName() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getPackageName(), is("com.netflix.frigga.ami"));
    }

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getVersion(), is("true"));
    }

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getBuildJobName(), is("build-true-job"));
    }

    @Test
    public void getCommit_ReturnsCorrectCommitHash() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getCommit(), is("abcdefg1234567890"));
    }

    @Test
    public void getAppVersionPattern_ReturnsExpectedPattern() {
        String regex = "^ami-[a-zA-Z]+$";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher(regex);
        assertThat(matcher.matches(), is(true));
    }
}

class AppVersion {
    private static final AppVersion TRUE = new AppVersion("true");

    public static AppVersion parseName(String amiName) { /* implementation */ }

    @Override
    public int compareTo(AppVersion other) { /* implementation */ }

    public static Pattern getAppVersionPattern() { /* implementation */ }

    public String getPackageName() { /* implementation */ }

    public String getVersion() { /* implementation */ }

    public String getBuildJobName() { /* implementation */ }

    public String getBuildNumber() { /* implementation */ }

    public String getCommit() { /* implementation */ }

    @Deprecated
    public String getChangelist() { /* implementation */ }

    @Override
    public String toString() { /* implementation */ }

    @Override
    public int hashCode() { /* implementation */ }

    @Override
    public boolean equals(Object obj) { /* implementation */
    }

}