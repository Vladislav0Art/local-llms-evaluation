package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildJobName_ValidInput_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ValidInput_ReturnsBuildJobName() {
        String amiName = "jenkins-job-name";
        String buildJobName = "jenkins-job-name";
        assertEquals(buildJobName, new AppVersion(amiName).getBuildJobName());
    }

}