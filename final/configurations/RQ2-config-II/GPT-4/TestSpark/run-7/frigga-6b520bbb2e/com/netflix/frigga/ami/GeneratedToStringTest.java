package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String amiName = "baseos-packagebase-0.0.4-h12.18121234";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.toString());
    }

}