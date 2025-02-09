package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion3 = AppVersion.parseName("myAmiName-mine-2-h123");

        assertEquals(true, appVersion1.equals(appVersion2));
        assertEquals(false, appVersion1.equals(appVersion3));
        assertEquals(false, appVersion1.equals(new Object()));
    }

}