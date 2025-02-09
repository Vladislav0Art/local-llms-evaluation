package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion version = AppVersion.parseName("packageName-version-buildJobName-buildNumber-commit");
        assertEquals("packageName", version.getPackageName());
        assertEquals("version", version.getVersion());
        assertEquals("buildJobName", version.getBuildJobName());
        assertEquals("buildNumber", version.getBuildNumber());
        assertEquals("commit", version.getCommit());
    }

}