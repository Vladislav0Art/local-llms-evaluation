package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualAppVersionsTest {

    @Test
    public void compareToEqualAppVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion");
        AppVersion version2 = AppVersion.parseName("testVersion");
        assertEquals(0, version1.compareTo(version2));
    }

}