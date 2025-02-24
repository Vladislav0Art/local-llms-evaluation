package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAppVersionPatternTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void getAppVersionPatternTest() {
        when(appVersion.getAppVersionPattern()).thenReturn(Pattern.compile("[a-z]"));
        assertEquals(Pattern.compile("[a-z]"), appVersion.getAppVersionPattern());
    }

}