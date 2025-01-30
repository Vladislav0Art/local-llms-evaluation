package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertNotNull(validAppVersion.hashCode());
    }

}