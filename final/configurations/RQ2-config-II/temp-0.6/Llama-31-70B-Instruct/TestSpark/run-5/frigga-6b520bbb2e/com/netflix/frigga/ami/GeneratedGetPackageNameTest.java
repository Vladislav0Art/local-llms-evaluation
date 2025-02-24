package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageNameTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void getPackageNameTest() {
        when(appVersion.getPackageName()).thenReturn("test");
        assertEquals("test", appVersion.getPackageName());
    }

}