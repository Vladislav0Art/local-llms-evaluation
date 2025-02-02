package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPackageName_NullAppVersion_ReturnsNull {

    @Test
    public void getPackageName_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

}