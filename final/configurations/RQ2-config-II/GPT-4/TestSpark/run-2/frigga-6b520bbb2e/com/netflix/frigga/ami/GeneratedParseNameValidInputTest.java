package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertNotNull(appVersion);
    }

}