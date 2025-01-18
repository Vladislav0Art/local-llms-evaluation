package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedGetChangelist_HappyScenario_Test {

    @Test
    public void getChangelist_HappyScenario_Test() {
        AppVersion appVersion = AppVersion.parseName("testname");
        String changelist = appVersion.getChangelist();
        assertThat(changelist, not(isEmptyOrNullString()));
    }

}