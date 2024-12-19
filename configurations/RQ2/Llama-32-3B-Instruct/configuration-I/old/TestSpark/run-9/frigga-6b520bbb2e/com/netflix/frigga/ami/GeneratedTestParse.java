package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParse {

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
    public void testParse() {
        AppVersion appVersion = new AppVersion("build-2");
        assertEquals("build", appVersion.getBuildJobName());
        assertEquals(2, appVersion.getBuildNumber());
    }

}