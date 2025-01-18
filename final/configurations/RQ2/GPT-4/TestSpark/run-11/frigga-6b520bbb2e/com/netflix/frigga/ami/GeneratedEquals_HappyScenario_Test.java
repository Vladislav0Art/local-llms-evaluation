package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedEquals_HappyScenario_Test {

    @Test
    public void equals_HappyScenario_Test() {
        AppVersion appVersion1 = AppVersion.parseName("testname");
        AppVersion appVersion2 = AppVersion.parseName("testname");
        assertTrue(appVersion1.equals(appVersion2));
    }

}