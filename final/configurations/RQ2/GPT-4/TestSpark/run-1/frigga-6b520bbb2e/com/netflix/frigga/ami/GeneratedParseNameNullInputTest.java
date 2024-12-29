package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedParseNameNullInputTest {

    @Test
    public void parseNameNullInputTest() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}