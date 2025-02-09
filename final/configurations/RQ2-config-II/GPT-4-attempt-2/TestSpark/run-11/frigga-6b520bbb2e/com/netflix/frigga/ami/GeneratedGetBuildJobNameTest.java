package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion test = new AppVersion("testJobName");
        assertEquals("testJobName", test.getBuildJobName());
    }

}