package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertNotNull(appVersion);
        assertEquals("myapp", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("h0.abcdefgh", appVersion.getBuildJobName());
    }

}