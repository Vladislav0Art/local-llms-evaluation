package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        String packageName = "test";
        appVersion.packageName = packageName;
        String resultPackageName = appVersion.getPackageName();
        assertEquals(packageName, resultPackageName);
    }

}