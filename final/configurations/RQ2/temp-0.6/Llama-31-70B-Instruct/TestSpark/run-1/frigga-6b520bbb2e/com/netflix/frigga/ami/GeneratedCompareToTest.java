package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    private AppVersion appVersion;

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();

        int result = appVersion.compareTo(other);

        assertEquals(0, result);
    }

}