package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameNotNullTest {

    @Test
    public void parseNameNotNullTest() {
        assertNotNull(AppVersion.parseName("amiName"));
    }

}