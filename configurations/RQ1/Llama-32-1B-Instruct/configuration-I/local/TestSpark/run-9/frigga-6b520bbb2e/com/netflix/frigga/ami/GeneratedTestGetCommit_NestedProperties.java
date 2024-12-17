package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetCommit_NestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetCommit_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("jenkins commit=changelist=value", appVersion.getCommit());
    }

}