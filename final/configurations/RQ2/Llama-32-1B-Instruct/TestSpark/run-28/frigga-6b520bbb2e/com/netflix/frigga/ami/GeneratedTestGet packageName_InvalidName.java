package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GeneratedTestGet packageName_InvalidName {

    @Test
    public void testGet

    packageName_InvalidName() {
        String expected = "";
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

}