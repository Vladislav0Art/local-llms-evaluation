package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidAppVersionTest {

    @Test
    public void parseNameInvalidAppVersionTest() {
        String appVersionString = "invalid-app-version";
        AppVersion appVersion = AppVersion.parseName(appVersionString);
        assertNull(appVersion);
    }

}