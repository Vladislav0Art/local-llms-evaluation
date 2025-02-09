package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("app-version-sample", appVersion.getPackageName());
    }

}