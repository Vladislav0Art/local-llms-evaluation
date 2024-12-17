package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetPackageName_NestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetPackageName_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("subscriberha-1.0.0-586499-changelist=value", appVersion.getPackageName());
    }

}