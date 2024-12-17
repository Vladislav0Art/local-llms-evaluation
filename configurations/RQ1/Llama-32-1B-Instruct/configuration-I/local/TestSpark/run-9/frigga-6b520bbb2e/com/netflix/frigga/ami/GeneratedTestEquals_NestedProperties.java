package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEquals_NestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testEquals_NestedProperties() {
        AppVersion other = new AppVersion();
        other.setChangelist("changelist", "value");
        other.setBuildJobName("jenkins job=changelist=value", "buildNumber=jenkins commit=changelist=value");
        assertEquals(other, appVersion);
    }

}