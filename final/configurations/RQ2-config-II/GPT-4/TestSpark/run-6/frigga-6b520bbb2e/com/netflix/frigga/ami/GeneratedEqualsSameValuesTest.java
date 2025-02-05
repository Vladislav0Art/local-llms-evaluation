package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameValuesTest {

    @Test
    public void equalsSameValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        AppVersion appVersion2 = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertTrue(appVersion1.equals(appVersion2));
    }

}