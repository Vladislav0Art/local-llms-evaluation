package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCode_ReturnsExpectedValue {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void hashCode_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        int expected = 123;
        assert appVersion.hashCode() == expected;
    }

}