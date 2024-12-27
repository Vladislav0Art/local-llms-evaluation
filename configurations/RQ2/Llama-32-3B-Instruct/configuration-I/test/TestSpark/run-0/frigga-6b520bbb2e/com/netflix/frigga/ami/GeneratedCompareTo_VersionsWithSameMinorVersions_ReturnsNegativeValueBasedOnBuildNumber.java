package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedCompareTo_VersionsWithSameMinorVersions_ReturnsNegativeValueBasedOnBuildNumber {

    @Test
    public void compareTo_VersionsWithSameMinorVersions_ReturnsNegativeValueBasedOnBuildNumber() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-app-1.2.3", 0);
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}