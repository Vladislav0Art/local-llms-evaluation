package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsTest_SameAppVersions_ReturnsTrue {

    @Test
    public void equalsTest_SameAppVersions_ReturnsTrue() {
        AppVersion appVersion1 = AppVersion.parseName("sameAppVersion");
        AppVersion appVersion2 = AppVersion.parseName("sameAppVersion");

        assertEquals(appVersion1, appVersion2);
    }

}