package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        assertEquals(APP_VERSION_PATTERN, appVersion.getAppVersionPattern());
    }

}