package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedCompareVersions_VersionsEqual_ReturnsZero {

    @Test
    public void compareVersions_VersionsEqual_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("my-package", "my-version");
        AppVersion appVersion2 = new AppVersion("my-package", "my-version");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}