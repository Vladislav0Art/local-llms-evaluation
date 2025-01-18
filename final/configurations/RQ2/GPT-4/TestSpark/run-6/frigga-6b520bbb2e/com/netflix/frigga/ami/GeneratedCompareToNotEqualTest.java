package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCompareToNotEqualTest {

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-build1-commit1");
        AppVersion appVersion2 = AppVersion.parseName("name-build2-commit2");
        Assert.assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}