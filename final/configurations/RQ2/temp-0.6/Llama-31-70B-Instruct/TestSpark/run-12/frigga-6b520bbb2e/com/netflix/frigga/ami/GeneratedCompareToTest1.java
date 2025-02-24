package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCompareToTest1 {

    @Test
    public void compareToTest1() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();

        int result = appVersion.compareTo(other);

        assertEquals(0, result);
    }

}