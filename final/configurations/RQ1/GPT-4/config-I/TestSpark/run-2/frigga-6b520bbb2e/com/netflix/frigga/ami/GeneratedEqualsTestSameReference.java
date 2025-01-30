package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTestSameReference {

    @Test
    public void equalsTestSameReference() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertTrue(appVersion.equals(appVersion));
    }

}