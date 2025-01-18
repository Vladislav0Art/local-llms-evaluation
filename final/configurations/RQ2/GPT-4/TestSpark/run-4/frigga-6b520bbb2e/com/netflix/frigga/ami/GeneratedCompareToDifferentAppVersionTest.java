package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToDifferentAppVersionTest {

    @Test
    public void compareToDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.server-1.1-h12.170042ebd");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}