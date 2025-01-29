package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetBuildJobName_MultipleNames {

    @Test
    public void testGetBuildJobName_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getBuildJobName()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildJobName());
    }

}