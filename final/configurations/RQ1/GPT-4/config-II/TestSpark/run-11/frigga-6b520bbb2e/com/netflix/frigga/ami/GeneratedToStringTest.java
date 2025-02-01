package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertEquals("AppVersion [packageName=appname, version=1.0.0, buildJobName=JobName, buildNumber=123456, changelist=gitHash]", appVersion.toString());
    }

}