package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        AppVersion appVersion2 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        assertTrue(appVersion1.equals(appVersion2));
    }

}