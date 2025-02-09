package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetVersion ReturnsExpectedValue {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void getVersion

    ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        String expected = "2.0";
        assert appVersion.getVersion().equals(expected);
    }

}