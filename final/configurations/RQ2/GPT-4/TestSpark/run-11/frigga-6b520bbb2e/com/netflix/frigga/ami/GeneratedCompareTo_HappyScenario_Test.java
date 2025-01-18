package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedCompareTo_HappyScenario_Test {

    @Test
    public void compareTo_HappyScenario_Test() {
        AppVersion appVersion1 = AppVersion.parseName("testname1");
        AppVersion appVersion2 = AppVersion.parseName("testname2");
        int result = appVersion1.compareTo(appVersion2);
        assertThat(result, not(0));
    }

}