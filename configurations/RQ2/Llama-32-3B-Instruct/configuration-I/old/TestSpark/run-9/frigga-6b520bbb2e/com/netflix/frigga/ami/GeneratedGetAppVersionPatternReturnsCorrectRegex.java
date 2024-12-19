package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAppVersionPatternReturnsCorrectRegex {

    @Test
    public void getAppVersionPatternReturnsCorrectRegex() {
        Pattern regex = AppVersion.getAppVersionPattern();
        Assert.assertTrue(regex.matcher("1.0-2.0").matches());
    }

}