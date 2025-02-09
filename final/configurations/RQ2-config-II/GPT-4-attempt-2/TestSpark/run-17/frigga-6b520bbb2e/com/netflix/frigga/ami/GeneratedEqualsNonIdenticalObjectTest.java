package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNonIdenticalObjectTest {

    @Test
    public void equalsNonIdenticalObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("testName1");
        AppVersion appVersion2 = AppVersion.parseName("testName2");
        assertFalse(appVersion1.equals(appVersion2));
    }

}