package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentObjectsTest {

    @Test
    public void compareToDifferentObjectsTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("2.0.0");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}