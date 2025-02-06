package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedCompareVersions_SameVersionEqualsZero {

    @Test
    public void compareVersions_SameVersionEqualsZero() {
        AppVersion version1 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        AppVersion version2 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        assertEquals(0, version1.compareTo(version2));
    }

}