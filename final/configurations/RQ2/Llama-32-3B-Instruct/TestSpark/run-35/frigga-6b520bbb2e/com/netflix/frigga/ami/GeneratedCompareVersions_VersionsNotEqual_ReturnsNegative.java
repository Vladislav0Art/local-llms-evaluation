package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedCompareVersions_VersionsNotEqual_ReturnsNegative {

    @Test
    public void compareVersions_VersionsNotEqual_ReturnsNegative() {
        AppVersion appVersion1 = new AppVersion("my-package", "my-version");
        AppVersion appVersion2 = new AppVersion("my-package", "new-version");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}