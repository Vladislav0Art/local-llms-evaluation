package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String sample = "ami-01234567890abcdef";
        AppVersion expected = new AppVersion(sample);
        AppVersion result = AppVersion.parseName(sample);

        assertEquals(expected, result);
    }

}