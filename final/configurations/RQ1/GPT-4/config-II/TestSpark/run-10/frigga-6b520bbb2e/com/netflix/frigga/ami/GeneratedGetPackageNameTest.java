package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");

        assertEquals("subscriberha", version.getPackageName());
    }

}