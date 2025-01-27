package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameInvalidAmeiNameTest {

    @Test
    public void parseNameInvalidAmeiNameTest() {
        AppVersion appVersion = AppVersion.parseName("Invalid");
        assertNotNull(appVersion);
        assertEquals("", appVersion.getBuildJobName());
        assertEquals("", appVersion.getVersion());
    }

}