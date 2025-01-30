package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentCommitTest {

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
    public void equalsDifferentCommitTest() {
        String aminame = "subscriberha-1.0.0-h586499.150/WE-WAPP-subscriberha/40";
        AppVersion other = AppVersion.parseName(aminame);
        assertFalse(appVersion.equals(other));
    }

}