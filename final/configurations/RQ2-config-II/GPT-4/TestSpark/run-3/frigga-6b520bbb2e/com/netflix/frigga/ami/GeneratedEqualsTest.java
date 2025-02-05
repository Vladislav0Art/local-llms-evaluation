package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("testAmiName1");
        AppVersion appVersion2 = AppVersion.parseName("testAmiName2");
        assertFalse(appVersion1.equals(appVersion2));
    }

}