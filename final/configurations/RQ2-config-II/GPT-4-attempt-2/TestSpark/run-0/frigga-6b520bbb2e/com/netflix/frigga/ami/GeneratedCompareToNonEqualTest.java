package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNonEqualTest {

    @Test
    public void compareToNonEqualTest() {
        AppVersion v1 = AppVersion.parseName("amiName1");
        AppVersion v2 = AppVersion.parseName("amiName2");
        assertEquals(-1, v1.compareTo(v2));
    }

}