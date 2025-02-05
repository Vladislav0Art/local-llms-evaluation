package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentAppVersionsTest {

    @Test
    public void compareToDifferentAppVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion1");
        AppVersion version2 = AppVersion.parseName("testVersion2");
        assertNotEquals(0, version1.compareTo(version2));
    }

}