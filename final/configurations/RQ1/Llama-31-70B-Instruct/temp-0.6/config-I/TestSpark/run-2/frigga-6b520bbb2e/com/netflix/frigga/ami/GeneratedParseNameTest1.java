package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedParseNameTest1 {

    @Test
    public void parseNameTest1() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}