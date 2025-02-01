package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTestDifferentCommit {

    @Test
    public void equalsTestDifferentCommit() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150");
        AppVersion appVersionDifferent = AppVersion.parseName("subscriberha-1.0.0-586499.h149");
        assertFalse(appVersion.equals(appVersionDifferent));
    }

}