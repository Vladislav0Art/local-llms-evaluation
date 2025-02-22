package com.netflix.frigga.ami;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCompareTo {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testCompareTo() {
        AppVersion other = mock(AppVersion.class);
        when(other.getBuildJobName()).thenReturn("buildJobName");
        when(other.getBuildNumber()).thenReturn("buildNumber");
        when(other.getCommit()).thenReturn("commit");
        when(other.getPackageName()).thenReturn("packageName");
        when(other.getVersion()).thenReturn("version");

        assertEquals(1, appVersion.compareTo(other));
    }

}