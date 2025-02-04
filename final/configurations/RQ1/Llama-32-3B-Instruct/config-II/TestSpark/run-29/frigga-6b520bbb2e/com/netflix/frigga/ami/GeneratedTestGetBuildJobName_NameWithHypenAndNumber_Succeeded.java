package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildJobName_NameWithHypenAndNumber_Succeeded {

    @Test
    public void testGetBuildJobName_NameWithHypenAndNumber_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("586499", appVersion.getBuildJobName());
    }

}