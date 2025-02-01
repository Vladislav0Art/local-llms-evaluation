package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTestDifferentVersion {

    @Test
    public void equalsTestDifferentVersion() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersionDifferent = AppVersion.parseName("subscriberha-1.0.1-h586499");
        assertFalse(appVersion.equals(appVersionDifferent));
    }

}