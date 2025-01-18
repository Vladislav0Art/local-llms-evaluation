package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetVersion_HappyScenario_Test {

    @Test
    public void getVersion_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String version = appVersion.getVersion();
        assertThat(version, not(isEmptyOrNullString()));
    }

}