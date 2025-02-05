package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("hai-3.4.5-h33");
        AppVersion appVersion2 = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}