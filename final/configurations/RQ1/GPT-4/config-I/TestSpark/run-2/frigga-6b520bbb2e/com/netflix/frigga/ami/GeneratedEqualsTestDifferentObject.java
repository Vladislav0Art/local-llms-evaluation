package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTestDifferentObject {

    @Test
    public void equalsTestDifferentObject() {
        AppVersion appVersion1 = AppVersion.parseName("myApp-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("myApp-2.0.0-h123456");
        assertFalse(appVersion1.equals(appVersion2));
    }

}