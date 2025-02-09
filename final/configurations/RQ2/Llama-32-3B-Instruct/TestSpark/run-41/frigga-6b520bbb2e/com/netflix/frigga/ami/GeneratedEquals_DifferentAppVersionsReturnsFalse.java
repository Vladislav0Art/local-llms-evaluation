package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentAppVersionsReturnsFalse {

    @Test
    public void equals_DifferentAppVersionsReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("my-app", "1.0");
        AppVersion appVersion2 = new AppVersion("different-app", "1.0");
        assertFalse(appVersion1.equals(appVersion2));
    }

}