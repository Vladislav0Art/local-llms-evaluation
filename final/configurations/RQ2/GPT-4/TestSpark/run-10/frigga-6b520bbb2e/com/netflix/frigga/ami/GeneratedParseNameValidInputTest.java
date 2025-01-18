package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion result = AppVersion.parseName("app-version");
        assertNotNull(result);
    }

}