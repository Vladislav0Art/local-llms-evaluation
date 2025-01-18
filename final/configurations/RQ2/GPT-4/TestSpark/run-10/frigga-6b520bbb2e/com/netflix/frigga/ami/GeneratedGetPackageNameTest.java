package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-version");
        String packageName = appVersion.getPackageName();
        assertEquals("app", packageName);
    }

}