package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertTrue(appVersion.hashCode() != 0);
    }

}