package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestGetVersionFromName {

    @Mock
    public AppVersion appVersion;

    @Test
    public void testGetVersionFromName() {
        Mockito.when(appVersion.parseName("")).thenReturn(null);
        // implementation
    }

}