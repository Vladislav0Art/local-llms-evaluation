package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentVersionTest {

    private static String PACKAGE_NAME = "subscriberha";
    private static String VERSION = "1.0.0";
    private static String BUILD_JOB_NAME = "WE-WAPP-subscriberha";
    private static String BUILD_NUMBER = "586499";
    private static String COMMIT = "150";
    AppVersion appVersion = createAppVersion();

    private AppVersion createAppVersion() {
        String aminame = String.format("%s-%s-h%s.%s/%s/%s", PACKAGE_NAME, VERSION, BUILD_NUMBER, COMMIT, BUILD_JOB_NAME, COMMIT);
        return AppVersion.parseName(aminame);
    }

    @Test
    public void compareToDifferentVersionTest() {
        String aminame = "subscriberha-1.0.1-h586499.150/WE-WAPP-subscriberha/150";
        AppVersion different = AppVersion.parseName(aminame);
        assertNotEquals(0, appVersion.compareTo(different));
    }

}