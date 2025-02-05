package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        String validAmiName = "baseos-packagebase-0.0.4-h12.18121234";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        assertNotNull(appVersion);
        assertEquals("baseos", appVersion.getPackageName());
        assertEquals("0.0.4", appVersion.getVersion());
    }

}