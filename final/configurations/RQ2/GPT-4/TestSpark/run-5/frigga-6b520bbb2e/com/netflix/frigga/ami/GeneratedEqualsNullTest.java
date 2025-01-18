package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotEquals(thisVersion, null);
    }

}