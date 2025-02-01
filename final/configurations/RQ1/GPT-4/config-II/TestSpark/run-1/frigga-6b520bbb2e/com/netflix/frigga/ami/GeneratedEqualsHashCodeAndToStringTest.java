package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsHashCodeAndToStringTest {

    @Test
    public void equalsHashCodeAndToStringTest() {
        String appVersionString = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appVersionString);
        AppVersion similarAppVersion = AppVersion.parseName(appVersionString);

        assertTrue(appVersion.equals(similarAppVersion));
        assertTrue(appVersion.hashCode() == similarAppVersion.hashCode());
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=586499, changelist=150]", appVersion.toString());
    }

}