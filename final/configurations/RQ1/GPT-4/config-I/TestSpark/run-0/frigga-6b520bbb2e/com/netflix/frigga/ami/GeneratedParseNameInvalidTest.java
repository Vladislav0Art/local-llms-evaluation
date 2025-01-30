package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidTest {

    @Test
    public void parseNameInvalidTest() {
        AppVersion appVersion = AppVersion.parseName("invalidNameFormat");
        assertNull(appVersion);
    }

}