package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.hashCode());
    }

}