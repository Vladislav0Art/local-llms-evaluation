package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        String expectedString = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=586499, changelist=null]";
        assertEquals(expectedString, appVersion.toString());
    }

}