package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAmiNameOldSchemaTest {

    @Test
    public void parseNameValidAmiNameOldSchemaTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertEquals("appname", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("123456", appVersion.getBuildNumber());
        assertNull(appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
    }

}