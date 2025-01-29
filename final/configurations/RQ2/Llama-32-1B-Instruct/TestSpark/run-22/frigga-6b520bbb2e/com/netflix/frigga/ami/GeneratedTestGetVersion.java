package com.netflix.frigga.ami;

import org.junit.Test;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion.version = 12345;
        assertEquals(12345, AppVersion.getVersion());
    }

}