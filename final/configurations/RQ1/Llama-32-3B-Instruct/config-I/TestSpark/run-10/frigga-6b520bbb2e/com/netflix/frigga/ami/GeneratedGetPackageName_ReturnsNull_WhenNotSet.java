package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetPackageName_ReturnsNull_WhenNotSet {

    @Test
    public void getPackageName_ReturnsNull_WhenNotSet() {
        assertNull(new AppVersion().getPackageName());
    }
}

public class AppVersion {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public AppVersion() {
    }

    public static AppVersion parseName(String input) {
        // implement parsing logic
        return new AppVersion();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

}