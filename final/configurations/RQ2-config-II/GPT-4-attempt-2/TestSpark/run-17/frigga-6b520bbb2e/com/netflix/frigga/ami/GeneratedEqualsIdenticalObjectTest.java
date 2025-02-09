package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsIdenticalObjectTest {

    @Test
    public void equalsIdenticalObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("testName");
        AppVersion appVersion2 = AppVersion.parseName("testName");
        assertTrue(appVersion1.equals(appVersion2));
    }

}