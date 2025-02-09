package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version-sample");
        AppVersion appVersion2 = AppVersion.parseName("app-version-sample");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}