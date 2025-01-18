package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern expectedPattern = Pattern.compile("(.*?)-(.*?)-(.*?)-(.*?)-(.*?)\\.(.*)");
        assertEquals(expectedPattern.toString(), AppVersion.getAppVersionPattern().toString());
    }

}