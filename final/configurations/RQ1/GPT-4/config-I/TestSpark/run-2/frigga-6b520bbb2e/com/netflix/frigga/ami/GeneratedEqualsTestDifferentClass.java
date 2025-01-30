package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTestDifferentClass {

    @Test
    public void equalsTestDifferentClass() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertFalse(appVersion.equals(new Object()));
    }

}