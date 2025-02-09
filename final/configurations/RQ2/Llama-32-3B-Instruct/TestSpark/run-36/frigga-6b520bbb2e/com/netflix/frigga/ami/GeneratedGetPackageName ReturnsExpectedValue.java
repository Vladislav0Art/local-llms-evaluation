package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName ReturnsExpectedValue {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void getPackageName

    ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        String expected = "com.netflix.frigga.ami";
        assert appVersion.getPackageName().equals(expected);
    }

}