package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetBuildNumber_MultipleNames {

    @Test
    public void testGetBuildNumber_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getBuildNumber()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildNumber());
    }

}