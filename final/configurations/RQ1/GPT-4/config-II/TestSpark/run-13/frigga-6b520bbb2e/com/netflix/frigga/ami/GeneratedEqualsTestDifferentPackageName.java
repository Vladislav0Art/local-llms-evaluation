package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTestDifferentPackageName {

    @Test
    public void equalsTestDifferentPackageName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersionDifferent = AppVersion.parseName("subscriberhb-1.0.0-h586499");
        assertFalse(appVersion.equals(appVersionDifferent));
    }

}