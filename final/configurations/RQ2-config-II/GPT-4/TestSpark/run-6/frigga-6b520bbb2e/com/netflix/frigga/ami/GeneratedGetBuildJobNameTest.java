package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertEquals("h0.abcdefgh", appVersion.getBuildJobName());
    }

}