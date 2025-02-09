package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNonAppVersionObjTest {

    @Test
    public void equalsNonAppVersionObjTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertFalse(appVersion.equals(new Object()));
    }

}