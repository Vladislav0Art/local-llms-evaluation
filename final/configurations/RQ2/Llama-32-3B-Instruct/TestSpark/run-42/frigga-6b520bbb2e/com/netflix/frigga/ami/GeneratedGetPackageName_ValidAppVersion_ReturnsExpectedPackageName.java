package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPackageName_ValidAppVersion_ReturnsExpectedPackageName {

    @Test
    public void getPackageName_ValidAppVersion_ReturnsExpectedPackageName() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String packageName = appVersion.getPackageName();
        assertEquals(NameConstants.APP_NAME, packageName);
    }

}