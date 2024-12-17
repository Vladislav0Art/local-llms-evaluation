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
public class GeneratedCompareTo_AppVersionWithLowerValue_ReturnsNegative {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void compareTo_AppVersionWithLowerValue_ReturnsNegative() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.4", "abcdz");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}