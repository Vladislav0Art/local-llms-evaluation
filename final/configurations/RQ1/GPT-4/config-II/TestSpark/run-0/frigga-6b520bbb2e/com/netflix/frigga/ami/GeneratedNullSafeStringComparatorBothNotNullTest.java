package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedNullSafeStringComparatorBothNotNullTest {

    @Test
    public void nullSafeStringComparatorBothNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500.h150/JENKINS/150");
        Assert.assertNotEquals(0, appVersion.compareTo(appVersion2));
    }

}