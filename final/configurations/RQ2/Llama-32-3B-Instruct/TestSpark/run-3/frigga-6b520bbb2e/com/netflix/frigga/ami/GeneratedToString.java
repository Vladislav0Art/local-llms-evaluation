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
public class GeneratedToString {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void toString() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        String expectedOutput = "com.netflix.frigga.ami/AppVersion@hashCode=-1094533944";
        assertEquals(expectedOutput, appVersion.toString());
    }

}