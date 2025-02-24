package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void parseNameTest() {
        when(appVersion.parseName("test")).thenReturn(new AppVersion());
        assertEquals(new AppVersion(), appVersion.parseName("test"));
    }

}