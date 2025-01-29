package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetPackageName_SimpleName {

    @Test
    public void testGetPackageName_SimpleName() {
        String expected = NameConstants.AMI_VERSION;
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

}