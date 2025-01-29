package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetVersion_SimpleName {

    @Test
    public void testGetVersion_SimpleName() {
        String expected = NameConstants.AMI_VERSION;
        when(getVersion()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getVersion());
    }

}