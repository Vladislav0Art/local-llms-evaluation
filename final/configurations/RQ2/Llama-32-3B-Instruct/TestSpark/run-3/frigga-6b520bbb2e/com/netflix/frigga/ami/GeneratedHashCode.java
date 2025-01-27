package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCode {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void hashCode() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        int expectedHashCode = -1094533944;
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

}