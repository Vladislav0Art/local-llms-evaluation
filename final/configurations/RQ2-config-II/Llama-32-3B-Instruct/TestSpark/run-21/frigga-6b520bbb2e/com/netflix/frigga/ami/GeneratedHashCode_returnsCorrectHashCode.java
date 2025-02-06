package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_returnsCorrectHashCode {

    @Test
    public void hashCode_returnsCorrectHashCode() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.2-1234");
        assertNotEquals(version1.hashCode(), version2.hashCode());
    }

}