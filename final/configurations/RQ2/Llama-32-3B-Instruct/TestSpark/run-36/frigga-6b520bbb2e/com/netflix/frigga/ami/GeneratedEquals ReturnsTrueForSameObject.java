package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals ReturnsTrueForSameObject {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void equals

    ReturnsTrueForSameObject() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = appVersion1;
        boolean result = appVersion1.equals(appVersion2);
        assert result == true;
    }

}