package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        String packageName = appVersion.getPackageName();
        assertNotNull(packageName);
    }

}