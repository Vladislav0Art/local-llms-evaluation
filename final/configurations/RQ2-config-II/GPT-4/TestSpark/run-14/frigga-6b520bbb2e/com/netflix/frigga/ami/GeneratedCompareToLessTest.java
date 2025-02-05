package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToLessTest {

    @Test
    public void compareToLessTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name2");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}