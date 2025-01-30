package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedParseNameNoMatchTest {

    @Test
    public void parseNameNoMatchTest() {
        assertNull(AppVersion.parseName("test-package-0.0.0-build1.build2"));
    }

}