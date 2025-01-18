package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String appName = "application1";
        AppVersion result = AppVersion.parseName(appName);
        assertNotNull(result);
    }

}