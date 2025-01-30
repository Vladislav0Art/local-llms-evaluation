package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-1.0.0-h123/A-Test-App/123");

        final int prime = 31;
        int result = 1;
        result = prime * result + ((appVersion.getBuildJobName() == null) ? 0 : appVersion.getBuildJobName().hashCode());
        result = prime * result + ((appVersion.getBuildNumber() == null) ? 0 : appVersion.getBuildNumber().hashCode());
        result = prime * result + ((appVersion.getCommit() == null) ? 0 : appVersion.getCommit().hashCode());
        result = prime * result + ((appVersion.getPackageName() == null) ? 0 : appVersion.getPackageName().hashCode());
        result = prime * result + ((appVersion.getVersion() == null) ? 0 : appVersion.getVersion().hashCode());

        assertEquals(result, appVersion.hashCode());
    }

}