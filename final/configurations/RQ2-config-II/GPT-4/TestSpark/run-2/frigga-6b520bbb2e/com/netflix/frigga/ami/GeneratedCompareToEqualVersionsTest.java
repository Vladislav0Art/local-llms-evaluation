package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualVersionsTest {

    @Test
    public void compareToEqualVersionsTest() {
        AppVersion appVersion1 = AppVersion.parseName("amiName");
        AppVersion appVersion2 = AppVersion.parseName("amiName");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}