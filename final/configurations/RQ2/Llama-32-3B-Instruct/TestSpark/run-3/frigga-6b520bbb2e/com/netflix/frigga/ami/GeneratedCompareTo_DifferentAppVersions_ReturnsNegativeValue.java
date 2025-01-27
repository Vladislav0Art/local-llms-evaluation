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
public class GeneratedCompareTo_DifferentAppVersions_ReturnsNegativeValue {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("1.1-9876543210");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}