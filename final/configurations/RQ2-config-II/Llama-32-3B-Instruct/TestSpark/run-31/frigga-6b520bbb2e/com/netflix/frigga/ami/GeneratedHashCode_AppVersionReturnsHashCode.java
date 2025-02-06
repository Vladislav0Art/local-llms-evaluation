package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_AppVersionReturnsHashCode {

    @Test
    public void hashCode_AppVersionReturnsHashCode() {
        AppVersion appVersion = new AppVersion();
        assertEquals(0, appVersion.hashCode());
    }

}