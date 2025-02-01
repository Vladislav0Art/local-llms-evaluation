package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsMismatchTest {

    @Test
    public void equalsMismatchTest() {
        AppVersion appVersion1 = AppVersion.parseName("appname-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("appname1-1.0.0-h123456");

        assertFalse(appVersion1.equals(appVersion2));
    }

}