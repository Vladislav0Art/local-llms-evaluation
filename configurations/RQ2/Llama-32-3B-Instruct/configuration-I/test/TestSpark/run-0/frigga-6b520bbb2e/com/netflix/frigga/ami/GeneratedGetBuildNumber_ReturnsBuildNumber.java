package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.util.Collections;
import java.io.IOException;

public class GeneratedGetBuildNumber_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildNumber());
    }

}