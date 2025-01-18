package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        assertNull(AppVersion.parseName(null));
    }

}