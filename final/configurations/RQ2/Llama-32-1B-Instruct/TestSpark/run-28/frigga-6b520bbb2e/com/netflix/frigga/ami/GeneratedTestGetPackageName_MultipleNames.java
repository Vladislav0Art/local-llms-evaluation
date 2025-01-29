package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetPackageName_MultipleNames {

    @Test
    public void testGetPackageName_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

}