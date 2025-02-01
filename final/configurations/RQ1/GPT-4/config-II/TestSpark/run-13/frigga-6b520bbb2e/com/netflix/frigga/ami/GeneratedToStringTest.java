package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertTrue(appVersion.toString().contains("AppVersion [packageName=subscriberha, version=1.0.0, buildNumber=586499, changelist=null]"));
    }

}