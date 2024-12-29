package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("test-ami");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

}