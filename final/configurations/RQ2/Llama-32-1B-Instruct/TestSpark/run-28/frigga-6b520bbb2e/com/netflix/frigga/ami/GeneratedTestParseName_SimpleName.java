package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestParseName_SimpleName {

    @Test
    public void testParseName_SimpleName() {
        String expected = "latest";
        when(AppVersion.parseName(anyString())).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.parseName("latest"));
    }

}