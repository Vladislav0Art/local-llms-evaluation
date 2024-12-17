package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetBuildJobName_NestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetBuildJobName_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("jenkins job=changelist=value", appVersion.getBuildJobName());
    }

}