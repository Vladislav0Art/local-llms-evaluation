package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetAppVersionPattern_ReturnsExpectedPattern {

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