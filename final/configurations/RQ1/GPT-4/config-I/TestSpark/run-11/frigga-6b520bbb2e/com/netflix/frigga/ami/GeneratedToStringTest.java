package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, " +
                "buildJobName=null, buildNumber=586499, changelist=null]", appVersion.toString());
    }

}