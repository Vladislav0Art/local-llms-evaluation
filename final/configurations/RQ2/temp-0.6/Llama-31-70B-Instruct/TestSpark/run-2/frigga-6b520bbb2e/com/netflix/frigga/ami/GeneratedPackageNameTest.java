package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedPackageNameTest {

    @Test
    public void packageNameTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getPackageName();
        assertNotNull(actual);
    }

}