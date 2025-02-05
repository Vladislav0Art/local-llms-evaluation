package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertEquals("AppVersion{packageName='myapp', version='1.0.0', buildJobName='h0', buildNumber='32', commit='abcdefgh'}", appVersion.toString());
    }

}