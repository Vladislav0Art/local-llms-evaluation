package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseInvalidFormat {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return version.split("-")[0];
    }

    public int getBuildNumber() {
        return Integer.parseInt(version.split("-")[1]);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppVersionTest {

    @Test
    public void testParseInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-format");
        assertEquals(null, appVersion.getBuildJobName());
        assertEquals(0, appVersion.getBuildNumber());
    }

}