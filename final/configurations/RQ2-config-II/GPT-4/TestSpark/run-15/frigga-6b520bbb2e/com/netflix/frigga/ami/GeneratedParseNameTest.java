package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        assertEquals("packageName", appVersion.getPackageName());
        assertEquals("version", appVersion.getVersion());
        assertEquals("buildJobName", appVersion.getBuildJobName());
        assertEquals("buildNum", appVersion.getBuildNumber());
        assertEquals("commit", appVersion.getCommit());
    }

}