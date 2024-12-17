package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAppVersionPattern_ReturnsPattern {

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }
}

public class AppVersion {

    // Implementation of the class

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