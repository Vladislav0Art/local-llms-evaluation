package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-12345";
        AppVersion result = AppVersion.parseName(amiName);
        assertTrue(result instanceof AppVersion);
    }

}