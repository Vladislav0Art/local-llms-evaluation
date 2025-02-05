package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();

        assertNull(appVersion.getVersion());
    }

}