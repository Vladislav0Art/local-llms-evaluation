package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsValidHashcode {

    @Test
    public void hashCode_ReturnsValidHashcode() {
        AppVersion appVersion = new AppVersion("my-app", "1.0");
        int hash = appVersion.hashCode();
        assertNotNull(hash);
    }

}