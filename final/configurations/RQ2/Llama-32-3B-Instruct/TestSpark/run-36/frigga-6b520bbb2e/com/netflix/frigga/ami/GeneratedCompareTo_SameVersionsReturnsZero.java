package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_SameVersionsReturnsZero {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void compareTo_SameVersionsReturnsZero() {
        AppVersion first = new AppVersion();
        AppVersion second = new AppVersion();
        int result = first.compareTo(second);
        assert result == 0;
    }

}