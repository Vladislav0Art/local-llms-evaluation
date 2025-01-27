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
public class GeneratedEquals SameAppVersion_ReturnsTrue {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void equals

    SameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("1.0-1234567890");
        assertTrue(appVersion1.equals(appVersion2));
    }

}