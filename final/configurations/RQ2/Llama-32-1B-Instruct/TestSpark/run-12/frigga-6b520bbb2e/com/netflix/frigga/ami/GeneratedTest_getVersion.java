package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getVersion {

    @Test
    public void test_getVersion() {
        AppVersion appVersion = new AppVersion();
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version);
    }

}