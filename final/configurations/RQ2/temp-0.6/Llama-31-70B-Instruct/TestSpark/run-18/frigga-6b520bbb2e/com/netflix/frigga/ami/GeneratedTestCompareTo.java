package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion appVersion = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion.compareTo(appVersion2));
    }

}