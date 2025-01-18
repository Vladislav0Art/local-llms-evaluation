package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsSameContentTest {

    @Test
    public void equalsSameContentTest() {
        AppVersion appVersion1 = AppVersion.parseName("name");
        AppVersion appVersion2 = AppVersion.parseName("name");
        assertTrue(appVersion1.equals(appVersion2));
    }

}