package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetCommit_HappyScenario_Test {

    @Test
    public void getCommit_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String commit = appVersion.getCommit();
        assertThat(commit, not(isEmptyOrNullString()));
    }

}