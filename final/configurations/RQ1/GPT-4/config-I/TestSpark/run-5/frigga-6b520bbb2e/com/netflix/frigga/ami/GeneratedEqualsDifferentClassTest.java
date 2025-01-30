package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentClassTest {

    @Test
    public void equalsDifferentClassTest() {
        String amiName = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertFalse(appVersion.equals(new Object()));
    }

}