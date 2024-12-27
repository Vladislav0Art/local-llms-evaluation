package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedCompareTo_VersionsWithDifferentMajorVersions_ReturnsNegativeValue {

    @Test
    public void compareTo_VersionsWithDifferentMajorVersions_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-app-1.2.3", 2);
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}