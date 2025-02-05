package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name1");
        assertTrue(appVersion1.equals(appVersion2));
    }

}