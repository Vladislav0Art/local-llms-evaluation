package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersions_AmiVersion1IsGreaterThanAmiVersion2 {

    @Test
    public void compareVersions_AmiVersion1IsGreaterThanAmiVersion2() {
        AppVersion appVersion1 = new AppVersion("ubuntu", 16, 4);
        AppVersion appVersion2 = new AppVersion("ubuntu", 15, 4);
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(1, result);
    }

}