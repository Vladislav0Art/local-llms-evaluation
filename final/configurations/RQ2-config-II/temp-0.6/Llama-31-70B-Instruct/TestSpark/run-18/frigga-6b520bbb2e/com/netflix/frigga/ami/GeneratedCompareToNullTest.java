package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = null;
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(1, result);
    }

}