package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = new AppVersion();
        Assert.assertFalse(appVersion.equals(null));
    }

}