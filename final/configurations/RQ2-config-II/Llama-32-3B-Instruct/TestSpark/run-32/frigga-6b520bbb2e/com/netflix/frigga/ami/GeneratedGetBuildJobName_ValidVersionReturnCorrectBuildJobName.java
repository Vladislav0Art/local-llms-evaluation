package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ValidVersionReturnCorrectBuildJobName {

    @Test
    public void getBuildJobName_ValidVersionReturnCorrectBuildJobName() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("build-1234", version.getBuildJobName());
    }

}