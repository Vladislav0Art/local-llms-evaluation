package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        String expected = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=null, buildNumber=586499, changelist=null]";
        assertEquals(expected, appVersion.toString());
    }

}