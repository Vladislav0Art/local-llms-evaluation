package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetVersion_ReturnsExpectedVersion {

    @Mock
    private Pattern pattern;

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = "1.0.0";
        AppVersion appVersion = new AppVersion(version);
        assertEquals(version, appVersion.getVersion());
    }

}