package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetPackageNameTest {

    private AppVersion appVersion;

    @Test
    public void getPackageNameTest() {
        String expectedPackageName = "package-name";

        String actualPackageName = appVersion.getPackageName();

        assertEquals(expectedPackageName, actualPackageName);
    }

}