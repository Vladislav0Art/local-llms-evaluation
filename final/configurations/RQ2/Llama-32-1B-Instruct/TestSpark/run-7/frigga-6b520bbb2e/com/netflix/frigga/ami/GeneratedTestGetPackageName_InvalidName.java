package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPackageName_InvalidName {

    @Test
    public void testGetPackageName_InvalidName() {
        appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

}