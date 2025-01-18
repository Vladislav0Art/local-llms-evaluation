package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetAppVersionPattern_HappyScenario_Test {

    @Test
    public void getAppVersionPattern_HappyScenario_Test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertThat(pattern, is(notNullValue()));
    }

}