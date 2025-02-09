package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameGivenNullNameTest {

    @Test
    public void parseNameGivenNullNameTest() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

}