package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion version = AppVersion.parseName("ami-name-1.2.3");
        String packageName = version.getPackageName();
        assertNotNull(packageName);
        assertEquals("ami-name", packageName);
    }

}