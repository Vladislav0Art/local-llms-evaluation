package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjTest {

    @Test
    public void equalsSameObjTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertTrue(appVersion.equals(appVersion));
    }

}