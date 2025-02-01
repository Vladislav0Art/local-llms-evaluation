package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCompareToSameObjectTest {

    @Test
    public void compareToSameObjectTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}