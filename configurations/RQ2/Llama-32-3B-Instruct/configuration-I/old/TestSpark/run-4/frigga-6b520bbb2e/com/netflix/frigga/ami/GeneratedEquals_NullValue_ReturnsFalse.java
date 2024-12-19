package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_NullValue_ReturnsFalse {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void equals_NullValue_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = null;
        assertFalse(appVersion1.equals(appVersion2));
    }

}