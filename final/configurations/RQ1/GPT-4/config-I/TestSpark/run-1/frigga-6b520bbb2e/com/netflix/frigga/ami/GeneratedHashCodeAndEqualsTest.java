package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeAndEqualsTest {

    @Test
    public void hashCodeAndEqualsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
        assertTrue(appVersion1.equals(appVersion2));
    }

}