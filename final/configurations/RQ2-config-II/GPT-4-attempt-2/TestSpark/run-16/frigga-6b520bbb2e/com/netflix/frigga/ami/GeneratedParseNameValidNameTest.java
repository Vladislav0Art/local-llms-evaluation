package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("valid-app-name");
        assertNotNull(appVersion);
    }

}