package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = new AppVersion();
        Assert.assertTrue(appVersion.equals(appVersion));
    }

}