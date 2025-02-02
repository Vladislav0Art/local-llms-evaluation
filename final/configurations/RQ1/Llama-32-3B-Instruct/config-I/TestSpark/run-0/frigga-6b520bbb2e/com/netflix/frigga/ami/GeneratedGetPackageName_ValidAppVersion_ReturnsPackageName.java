package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPackageName_ValidAppVersion_ReturnsPackageName {

    @Test
    public void getPackageName_ValidAppVersion_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.packageName = "com.netflix.frigga.ami";
        assertEquals("com.netflix.frigga.ami", appVersion.getPackageName());
    }

}