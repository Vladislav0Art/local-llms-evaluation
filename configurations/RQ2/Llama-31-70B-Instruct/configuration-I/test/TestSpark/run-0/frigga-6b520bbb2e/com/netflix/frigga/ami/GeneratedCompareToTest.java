package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();
        int result = appVersion.compareTo(other);
        assertNotEquals(0, result);
    }

}