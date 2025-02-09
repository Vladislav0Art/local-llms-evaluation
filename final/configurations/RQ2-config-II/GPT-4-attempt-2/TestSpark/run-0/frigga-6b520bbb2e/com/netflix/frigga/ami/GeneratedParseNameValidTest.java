package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidTest {

    @Test
    public void parseNameValidTest() {
        AppVersion result = AppVersion.parseName("amiName");
        assertNotNull(result);
    }

}