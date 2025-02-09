package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        int hashCode = appVersion.hashCode();
        assertNotNull(hashCode);
    }

}