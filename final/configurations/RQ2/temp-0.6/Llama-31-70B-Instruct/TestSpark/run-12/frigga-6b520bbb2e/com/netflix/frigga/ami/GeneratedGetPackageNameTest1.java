package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetPackageNameTest1 {

    @Test
    public void getPackageNameTest1() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getPackageName();

        assertNotNull(result);
    }

}