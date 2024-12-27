package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedCompareTo_VersionsWithDifferentMinorVersions_ReturnsPositiveValue {

    @Test
    public void compareTo_VersionsWithDifferentMinorVersions_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-app-1.2.3", 1);
        assertEquals(1, appVersion1.compareTo(appVersion2));
    }

}