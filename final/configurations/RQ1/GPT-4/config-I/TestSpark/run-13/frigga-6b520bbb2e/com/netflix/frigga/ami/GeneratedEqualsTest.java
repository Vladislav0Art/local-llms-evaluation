package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion validAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        AppVersion validAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion1.equals(validAppVersion2));
    }

}