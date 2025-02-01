package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertFalse(appVersion.equals(null));
    }

}