package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion v1 = AppVersion.parseName("amiName");
        AppVersion v2 = AppVersion.parseName("amiName");
        assertEquals(0, v1.compareTo(v2));
    }

}