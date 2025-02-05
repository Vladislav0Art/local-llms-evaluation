package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidTest {

    @Test
    public void parseNameValidTest() {
        AppVersion appVersion = AppVersion.parseName("name1");
        assertNotNull(appVersion);
    }

}