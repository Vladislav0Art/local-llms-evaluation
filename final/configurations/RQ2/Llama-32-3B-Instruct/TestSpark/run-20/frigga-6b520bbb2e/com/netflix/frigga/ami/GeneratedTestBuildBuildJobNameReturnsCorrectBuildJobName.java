package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestBuildBuildJobNameReturnsCorrectBuildJobName {

    @Mock
    public AppVersion appVersion;

    @Test
    public void testBuildBuildJobNameReturnsCorrectBuildJobName() {
        // implementation
    }
}

class AppVersion {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public static AppVersion parseName(String amiName) {
        return new AppVersion(amiName);
    }

    public void compareTo(AppVersion otherAppVersion) {
        // implementation
    }

}