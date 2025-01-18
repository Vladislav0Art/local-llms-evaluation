package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetBuildJobName_HappyScenario_Test {

    @Test
    public void getBuildJobName_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String buildJobName = appVersion.getBuildJobName();
        assertThat(buildJobName, not(isEmptyOrNullString()));
    }

}