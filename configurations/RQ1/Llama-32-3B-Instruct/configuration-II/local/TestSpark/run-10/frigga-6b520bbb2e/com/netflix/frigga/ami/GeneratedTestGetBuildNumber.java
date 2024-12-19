package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetBuildNumber {

    @Mock
    private String amiName;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testGetBuildNumber() {
        appVersion.setCommit("hudson-1.0.0-586500");
        assertEquals("hudson-1.0.0-586500", appVersion.getBuildNumber());
    }

}