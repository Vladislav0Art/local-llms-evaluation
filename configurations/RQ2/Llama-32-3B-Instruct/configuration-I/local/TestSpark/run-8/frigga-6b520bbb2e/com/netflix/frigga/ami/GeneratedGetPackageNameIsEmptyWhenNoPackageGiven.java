package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPackageNameIsEmptyWhenNoPackageGiven {

    @Test
    public void getPackageNameIsEmptyWhenNoPackageGiven() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getPackageName());
        assertEquals("", appVersion.getPackageName());
    }

}