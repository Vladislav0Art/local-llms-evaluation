package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();

        int result = appVersion.compareTo(other);

        assertTrue(result > 0);
    }

}