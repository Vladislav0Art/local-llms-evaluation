package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("testApp-0.0.1");
        AppVersion appVersion2 = AppVersion.parseName("testApp-0.0.1");
        assertTrue(appVersion1.equals(appVersion2));
    }

}