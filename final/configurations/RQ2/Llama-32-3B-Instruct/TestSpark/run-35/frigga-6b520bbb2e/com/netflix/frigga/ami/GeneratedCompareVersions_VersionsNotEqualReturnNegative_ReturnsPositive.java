package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedCompareVersions_VersionsNotEqualReturnNegative_ReturnsPositive {

    @Test
    public void compareVersions_VersionsNotEqualReturnNegative_ReturnsPositive() {
        AppVersion appVersion1 = new AppVersion("my-package", "my-version");
        AppVersion appVersion2 = new AppVersion("new-package", "my-version");
        assertEquals(1, appVersion1.compareTo(appVersion2));
    }

}