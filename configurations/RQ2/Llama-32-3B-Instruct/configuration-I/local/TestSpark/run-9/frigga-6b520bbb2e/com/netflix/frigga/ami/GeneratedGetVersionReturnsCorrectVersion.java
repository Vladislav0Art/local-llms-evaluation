package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetVersionReturnsCorrectVersion {

    @Test
    public void getVersionReturnsCorrectVersion() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        String version = appVersion.getVersion();
        // Test implementation
    }

}