package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetBuildJobName {

    @Test
    public void [AppVersion][Scenario]TestGetBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-job-name", buildJobName);
    }

}