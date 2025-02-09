package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String changelist = appVersion.getChangelist();
        Assert.assertNotNull(changelist);
    }

}