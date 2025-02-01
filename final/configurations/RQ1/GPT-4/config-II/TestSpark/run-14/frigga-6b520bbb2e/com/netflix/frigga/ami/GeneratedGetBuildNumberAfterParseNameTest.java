package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberAfterParseNameTest {

    @Test
    public void getBuildNumberAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("150", ver.getBuildNumber());
    }

}