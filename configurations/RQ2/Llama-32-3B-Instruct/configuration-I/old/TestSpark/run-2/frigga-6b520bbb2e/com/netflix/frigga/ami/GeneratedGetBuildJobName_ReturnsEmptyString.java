package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetBuildJobName_ReturnsEmptyString {

    @Test
    public void getBuildJobName_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.getBuildJobName().isEmpty());
    }

}