package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

}