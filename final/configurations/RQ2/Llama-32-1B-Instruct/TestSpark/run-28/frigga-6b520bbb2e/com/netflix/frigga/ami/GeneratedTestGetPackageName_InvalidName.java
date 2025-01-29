package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetPackageName_InvalidName {

    @Test
    public void testGetPackageName_InvalidName() {
        String expected = "latest";
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

}