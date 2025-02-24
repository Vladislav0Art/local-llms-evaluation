package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToInvalidTest {

    @Test
    public void compareToInvalidTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion.setVersion("invalid");
        appVersion2.setVersion("invalid");
        assertTrue(appVersion.compareTo(appVersion2) == 0);
    }

}