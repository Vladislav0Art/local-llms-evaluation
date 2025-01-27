package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildJobName_invalid_build_job_name_test {

    @Test
    public void getBuildJobName_invalid_build_job_name_test() {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getBuildJobName());
    }

}