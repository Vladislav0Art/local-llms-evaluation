package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        int expectedHashCode = appVersion.toString().hashCode();
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

}