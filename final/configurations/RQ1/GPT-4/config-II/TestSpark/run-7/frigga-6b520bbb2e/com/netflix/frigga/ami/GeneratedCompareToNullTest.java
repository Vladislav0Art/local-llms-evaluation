package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(1, appVersion.compareTo(null));
    }

}