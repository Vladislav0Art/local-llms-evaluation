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
public class GeneratedEquals_AppVersionWithSameValues_ReturnsTrue {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void equals_AppVersionWithSameValues_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.3", "abcde");
        assertTrue(appVersion1.equals(appVersion2));
    }

}