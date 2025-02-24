package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        String expectedPackageName = "packageName";
        when(appVersion.getPackageName()).thenReturn(expectedPackageName);
        String actualPackageName = appVersion.getPackageName();
        assertEquals(expectedPackageName, actualPackageName);
    }

}