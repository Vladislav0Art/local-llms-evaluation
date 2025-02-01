package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringAfterParseNameTest {

    @Test
    public void toStringAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertTrue(ver.toString().contains("packageName=subscriberha"));
    }

}