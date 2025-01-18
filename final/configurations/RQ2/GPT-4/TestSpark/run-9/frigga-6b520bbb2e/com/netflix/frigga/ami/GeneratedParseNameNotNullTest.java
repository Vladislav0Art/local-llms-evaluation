package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedParseNameNotNullTest {

    @Test
    public void parseNameNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion);
    }

}