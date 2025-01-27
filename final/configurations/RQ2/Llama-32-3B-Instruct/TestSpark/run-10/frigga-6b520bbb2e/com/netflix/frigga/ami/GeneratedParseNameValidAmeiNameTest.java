package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameValidAmeiNameTest {

    @Test
    public void parseNameValidAmeiNameTest() {
        AppVersion appVersion = AppVersion.parseName("1.9.2-amazon-linux-ufi");
        assertNotNull(appVersion);
        assertTrue(appVersion.getBuildJobName().equals("build-1.9.2"));
        assertTrue(appVersion.getVersion().equals("1.9.2"));
    }

}