package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();
        when(appVersion.compareTo(other)).thenReturn(1);
        int actual = appVersion.compareTo(other);
        assertTrue(actual > 0);
    }

}