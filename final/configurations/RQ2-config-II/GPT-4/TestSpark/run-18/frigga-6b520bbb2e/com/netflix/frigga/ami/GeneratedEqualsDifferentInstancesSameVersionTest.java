package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentInstancesSameVersionTest {

    @Test
    public void equalsDifferentInstancesSameVersionTest() {
        AppVersion version1 = AppVersion.parseName("testVersion");
        AppVersion version2 = AppVersion.parseName("testVersion");
        assertTrue(version1.equals(version2));
    }

}