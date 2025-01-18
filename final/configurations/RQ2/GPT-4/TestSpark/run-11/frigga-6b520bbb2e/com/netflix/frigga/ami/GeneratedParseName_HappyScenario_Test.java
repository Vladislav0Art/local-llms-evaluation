package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedParseName_HappyScenario_Test {

    @Test
    public void parseName_HappyScenario_Test() {
        String amiName = "testname";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion, is(notNullValue()));
    }

}