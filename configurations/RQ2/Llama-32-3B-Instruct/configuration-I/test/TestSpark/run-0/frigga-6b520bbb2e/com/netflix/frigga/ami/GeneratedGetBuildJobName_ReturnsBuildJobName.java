package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.util.Collections;
import java.io.IOException;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("my-app-1.2.3");
        assertEquals("my-app", appVersion.getBuildJobName());
    }

}