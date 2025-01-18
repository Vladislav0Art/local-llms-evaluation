package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsDifferentTypeTest {

    @Test
    public void equalsDifferentTypeTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertFalse(appVersion.equals(new Object()));
    }

}