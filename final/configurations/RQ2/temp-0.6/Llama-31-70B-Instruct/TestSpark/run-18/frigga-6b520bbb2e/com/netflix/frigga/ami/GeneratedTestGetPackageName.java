package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

}