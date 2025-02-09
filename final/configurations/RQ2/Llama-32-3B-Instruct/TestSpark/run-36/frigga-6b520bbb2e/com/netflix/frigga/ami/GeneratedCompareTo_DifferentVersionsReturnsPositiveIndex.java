package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_DifferentVersionsReturnsPositiveIndex {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void compareTo_DifferentVersionsReturnsPositiveIndex() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion();
        int result = first.compareTo(second);
        assert result > 0;
    }

}