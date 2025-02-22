package com.netflix.frigga.ami;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetPackageName() {
        appVersion.packageName = "packageName";
        assertEquals("packageName", appVersion.getPackageName());
    }

}