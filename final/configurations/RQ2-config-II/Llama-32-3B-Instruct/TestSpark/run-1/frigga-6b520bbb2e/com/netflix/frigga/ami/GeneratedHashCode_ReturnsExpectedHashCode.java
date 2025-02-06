package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsExpectedHashCode {

    @Test
    public void hashCode_ReturnsExpectedHashCode() {
        int expectedHashCode = 1234567890;
        assertEquals(expectedHashCode, AppVersion.parseName("ami-1234567890").hashCode());
    }

}