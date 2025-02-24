package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareToTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();
        when(appVersion.compareTo(other)).thenReturn(0);
        assertEquals(0, appVersion.compareTo(other));
    }

}