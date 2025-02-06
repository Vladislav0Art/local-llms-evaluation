package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals("1.2.3", appVersion.getVersion());
    }

}