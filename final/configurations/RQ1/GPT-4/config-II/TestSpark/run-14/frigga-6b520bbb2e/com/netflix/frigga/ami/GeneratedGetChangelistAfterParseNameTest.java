package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistAfterParseNameTest {

    @Test
    public void getChangelistAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("586499", ver.getChangelist());
    }

}