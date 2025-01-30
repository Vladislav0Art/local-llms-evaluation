package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}