package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPackageName_NameIsNotEmpty {

    @Test
    public void testGetPackageName_NameIsNotEmpty() {
        appVersion = new AppVersion();
        assertNotNull(appVersion.getPackageName());
    }

}