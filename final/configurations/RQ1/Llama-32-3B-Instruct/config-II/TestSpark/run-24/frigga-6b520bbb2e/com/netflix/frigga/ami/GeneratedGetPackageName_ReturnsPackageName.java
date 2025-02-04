package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName_ReturnsPackageName {

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void getPackageName_ReturnsPackageName() {
        appVersion.packageName = "a";
        assertEquals("a", appVersion.getPackageName());
    }

}