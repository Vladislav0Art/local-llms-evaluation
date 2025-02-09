package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}