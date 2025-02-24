package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = Mockito.mock(AppVersion.class);
        int result = appVersion.compareTo(other);
        assertNotEquals(0, result);
    }

}