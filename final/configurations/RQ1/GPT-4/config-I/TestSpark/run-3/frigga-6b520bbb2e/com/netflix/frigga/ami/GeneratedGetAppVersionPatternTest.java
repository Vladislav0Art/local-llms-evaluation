package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

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
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

}