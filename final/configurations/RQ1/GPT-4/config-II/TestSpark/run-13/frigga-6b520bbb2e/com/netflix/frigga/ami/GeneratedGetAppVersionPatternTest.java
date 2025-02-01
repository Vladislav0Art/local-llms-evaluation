package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("subscriberha-1.0.0-h586499").matches());
    }

}