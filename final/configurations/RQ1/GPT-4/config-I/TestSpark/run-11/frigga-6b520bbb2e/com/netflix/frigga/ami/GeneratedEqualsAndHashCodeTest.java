package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedEqualsAndHashCodeTest {

    @Test
    public void equalsAndHashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertTrue(appVersion1.equals(appVersion2));
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}