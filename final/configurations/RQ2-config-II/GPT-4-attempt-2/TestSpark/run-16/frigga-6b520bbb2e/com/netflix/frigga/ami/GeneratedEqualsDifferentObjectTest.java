package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version-sample");
        AppVersion appVersion2 = AppVersion.parseName("app-version-sample");
        assertTrue(appVersion1.equals(appVersion2));
    }

}