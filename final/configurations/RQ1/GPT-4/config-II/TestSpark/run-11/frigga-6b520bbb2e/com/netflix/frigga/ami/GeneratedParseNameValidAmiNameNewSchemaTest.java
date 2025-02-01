package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAmiNameNewSchemaTest {

    @Test
    public void parseNameValidAmiNameNewSchemaTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertEquals("appname", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("123456", appVersion.getBuildNumber());
        assertEquals("JobName", appVersion.getBuildJobName());
        assertEquals("gitHash", appVersion.getCommit());
    }

}