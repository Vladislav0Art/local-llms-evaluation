package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsNotInstanceOfAppVersionTest {

    @Test
    public void equalsNotInstanceOfAppVersionTest() {
        AppVersion appVersion = new AppVersion();

        assertFalse(appVersion.equals(new Object()));
    }

}