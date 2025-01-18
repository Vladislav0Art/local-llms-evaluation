package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedToString_HappyScenario_Test {

    @Test
    public void toString_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String stringAppVersion = appVersion.toString();
        assertNotNull(stringAppVersion);
    }

}