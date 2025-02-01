package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedEqualsDifferentObjectTypeTest {

    @Test
    public void equalsDifferentObjectTypeTest() {
        AppVersion appVersion = new AppVersion();
        Assert.assertFalse(appVersion.equals(new Object()));
    }

}