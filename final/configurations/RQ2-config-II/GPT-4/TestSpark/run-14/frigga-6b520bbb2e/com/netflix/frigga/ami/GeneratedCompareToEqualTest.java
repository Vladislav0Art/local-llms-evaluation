package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name1");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}