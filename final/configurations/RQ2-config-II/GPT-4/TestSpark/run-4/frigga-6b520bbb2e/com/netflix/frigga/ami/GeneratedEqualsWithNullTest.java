package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsWithNullTest {

    @Test
    public void equalsWithNullTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertFalse(appVersion.equals(null));
    }

}