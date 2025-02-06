package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collections;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;
import org.mockito.MockingDetails;

public class GeneratedGetBuildJobName_OkayTest {

    @Test
    public void getBuildJobName_OkayTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildJobName());
    }

}