package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        String appName = "changelist1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getChangelist());
    }

}