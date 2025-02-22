package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}