package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareToOtherNotNullTest {

    @Test
    public void compareToOtherNotNullTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = mock(AppVersion.class);

        assertTrue(appVersion.compareTo(other) instanceof Integer);
    }

}