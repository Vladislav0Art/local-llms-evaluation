package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getBuildNumber());
    }

}