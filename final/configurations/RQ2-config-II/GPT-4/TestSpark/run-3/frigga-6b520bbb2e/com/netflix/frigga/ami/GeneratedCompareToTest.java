package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("testAmiName1");
        AppVersion appVersion2 = Mockito.spy(AppVersion.class);
        int result = appVersion1.compareTo(appVersion2);
        Mockito.verify(appVersion2).compareTo(appVersion1);
        assertEquals(1, result);
    }

}