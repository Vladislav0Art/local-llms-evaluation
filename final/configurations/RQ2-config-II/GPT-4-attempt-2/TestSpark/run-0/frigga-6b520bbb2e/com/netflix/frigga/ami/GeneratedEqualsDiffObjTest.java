package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDiffObjTest {

    @Test
    public void equalsDiffObjTest() {
        AppVersion appVersion1 = AppVersion.parseName("amiName1");
        AppVersion appVersion2 = AppVersion.parseName("amiName2");
        assertFalse(appVersion1.equals(appVersion2));
    }

}