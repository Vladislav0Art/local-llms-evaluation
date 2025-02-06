package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsExpectedVersion {

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = "1234567890";
        assertEquals(version, AppVersion.parseName("ami-1234567890").getVersion());
    }

}