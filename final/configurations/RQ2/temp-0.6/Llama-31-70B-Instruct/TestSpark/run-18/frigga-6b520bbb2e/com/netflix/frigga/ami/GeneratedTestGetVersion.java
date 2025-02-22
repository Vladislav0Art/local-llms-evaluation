package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getVersion());
    }

}