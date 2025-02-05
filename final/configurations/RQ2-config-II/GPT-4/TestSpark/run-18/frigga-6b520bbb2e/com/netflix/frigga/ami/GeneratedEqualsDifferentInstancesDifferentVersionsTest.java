package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentInstancesDifferentVersionsTest {

    @Test
    public void equalsDifferentInstancesDifferentVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion1");
        AppVersion version2 = AppVersion.parseName("testVersion2");
        assertFalse(version1.equals(version2));
    }

}