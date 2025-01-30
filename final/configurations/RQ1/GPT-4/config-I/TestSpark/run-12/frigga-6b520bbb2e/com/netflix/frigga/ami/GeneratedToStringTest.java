package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-1.0.0-h123/A-Test-App/123");
        assertTrue(appVersion.toString().contains("AppVersion [packageName=" + appVersion.getPackageName() + ", version=" + appVersion.getVersion()
                + ", buildJobName=" + appVersion.getBuildJobName() + ", buildNumber=" + appVersion.getBuildNumber()
                + ", changelist=" + appVersion.getCommit() + "]"));
    }

}