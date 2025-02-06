package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_AppVersionEqualsToSelf_ReturnsTrue {

    @Test
    public void equals_AppVersionEqualsToSelf_ReturnsTrue() {
        AppVersion appVersion = new AppVersion();
        assertTrue(appVersion.equals(appVersion));
    }

}