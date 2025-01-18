package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsDifferentContentTest {

    @Test
    public void equalsDifferentContentTest() {
        AppVersion appVersion1 = AppVersion.parseName("name");
        AppVersion appVersion2 = AppVersion.parseName("diffName");
        assertFalse(appVersion1.equals(appVersion2));
    }

}