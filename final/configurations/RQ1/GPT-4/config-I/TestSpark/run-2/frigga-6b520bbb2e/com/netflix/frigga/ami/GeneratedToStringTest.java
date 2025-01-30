package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        String expectedToString = "AppVersion [packageName=myApp, version=1.0.0, buildJobName=null, buildNumber=123456, changelist=null]";
        assertEquals(expectedToString, appVersion.toString());
    }

}