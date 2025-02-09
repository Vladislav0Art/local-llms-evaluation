package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertTrue(appVersion.equals(appVersion));
    }

}