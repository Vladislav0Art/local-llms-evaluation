package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName_NotGiven_ReturnsNull {

    @Mock
    private String amiName;

    @Test
    public void getPackageName_NotGiven_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

}