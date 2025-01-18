package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("app1");
        AppVersion version2 = AppVersion.parseName("app2");
        assertTrue(version1.compareTo(version2) != 0);
    }

}