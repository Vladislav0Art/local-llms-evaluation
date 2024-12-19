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
public class GeneratedParseName_ValidAMIName_ReturnsAppVersion {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void parseName_ValidAMIName_ReturnsAppVersion() {
        String amiName = "1.2.3-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(appVersion, new AppVersion("1.2.3", "abcde"));
    }

}