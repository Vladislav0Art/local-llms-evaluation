package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareTo_DifferentAppVersion_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentAppVersion_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("1.0");
        AppVersion appVersion2 = new AppVersion("2.0");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }
}

class AppVersionUtils {

    public static String getVersionFromName(String amiName) {
        // implementation
    }

    public static void buildPackageReturnsCorrectPackageName() {
        // implementation
    }

    public static boolean buildBuildJobNameReturnsCorrectBuildJobName() {
        // implementation
    }

}