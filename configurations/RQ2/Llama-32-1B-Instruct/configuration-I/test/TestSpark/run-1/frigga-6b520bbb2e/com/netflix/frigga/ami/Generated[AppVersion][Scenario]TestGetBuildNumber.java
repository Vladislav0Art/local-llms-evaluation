package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetBuildNumber {

    @Test
    public void [AppVersion][Scenario]TestGetBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        long buildNumber = appVersion.getBuildNumber();
        assertEquals(12345L, buildNumber); // should be 12345
    }

}