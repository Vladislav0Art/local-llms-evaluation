package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        assertNotNull(AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion"));
    }

}