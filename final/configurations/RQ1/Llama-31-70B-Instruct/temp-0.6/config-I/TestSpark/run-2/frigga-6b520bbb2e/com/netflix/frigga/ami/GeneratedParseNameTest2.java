package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedParseNameTest2 {

    @Test
    public void parseNameTest2() {
        String amiName = "invalid-appversion-tag";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}