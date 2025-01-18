package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedHashCode_HappyScenario_Test {

    @Test
    public void hashCode_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        int hashCode = appVersion.hashCode();
        assertThat(hashCode, not(0));
    }

}