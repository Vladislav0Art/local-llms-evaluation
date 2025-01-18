package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetBuildNumber_HappyScenario_Test {

    @Test
    public void getBuildNumber_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String buildNumber = appVersion.getBuildNumber();
        assertThat(buildNumber, not(isEmptyOrNullString()));
    }

}