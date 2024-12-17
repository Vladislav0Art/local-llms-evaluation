package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_AppVersionWithSameValue_ReturnsZero {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void compareTo_AppVersionWithSameValue_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.3", "abcde");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}