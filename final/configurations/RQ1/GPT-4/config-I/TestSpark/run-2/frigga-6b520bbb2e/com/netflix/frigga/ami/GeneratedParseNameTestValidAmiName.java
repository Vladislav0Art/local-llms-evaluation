package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTestValidAmiName {

    @Test
    public void parseNameTestValidAmiName() {
        AppVersion result = AppVersion.parseName("myApp-1.0.0-h123456");

        assertNotNull(result);
        assertEquals("myApp", result.getPackageName());
        assertEquals("1.0.0", result.getVersion());
        assertEquals("123456", result.getBuildNumber());
        assertNull(result.getCommit());
        assertNull(result.getBuildJobName());
    }

}