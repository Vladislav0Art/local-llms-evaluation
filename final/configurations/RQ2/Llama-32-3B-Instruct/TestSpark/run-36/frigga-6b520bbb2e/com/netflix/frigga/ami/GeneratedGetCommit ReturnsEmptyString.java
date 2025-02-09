package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommit ReturnsEmptyString {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void getCommit

    ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion();
        String expected = "";
        assert appVersion.getCommit().equals(expected);
    }

}