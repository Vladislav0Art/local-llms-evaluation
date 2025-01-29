package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetVersion_MultipleNames {

    @Test
    public void testGetVersion_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getVersion()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getVersion());
    }

}