package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-1.0.0-h1.build1-abcdef");
        AppVersion appVersion2 = AppVersion.parseName("app-1.0.0-h1.build1-abcdef");
        assertTrue(appVersion1.equals(appVersion2));
    }

}