package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        String appName = "version1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getVersion());
    }

}