package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_SingleWord_ReturnsAppVersionInstance {

    @Test
    public void parseName_SingleWord_ReturnsAppVersionInstance() {
        AppVersion appVersion = AppVersion.parseName("myapp");
        assertEquals("myapp", appVersion.getVersion());
    }

}