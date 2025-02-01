package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTestDifferentBuildJobName {

    @Test
    public void equalsTestDifferentBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersionDifferent = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriber/150");
        assertFalse(appVersion.equals(appVersionDifferent));
    }

}