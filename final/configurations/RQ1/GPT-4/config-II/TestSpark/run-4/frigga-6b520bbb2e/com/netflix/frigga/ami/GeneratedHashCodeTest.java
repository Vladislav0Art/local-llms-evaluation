package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(parsedAppVersion1.hashCode(), parsedAppVersion2.hashCode());
    }

}