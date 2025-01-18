package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        String appName = "package";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getPackageName());
    }

}