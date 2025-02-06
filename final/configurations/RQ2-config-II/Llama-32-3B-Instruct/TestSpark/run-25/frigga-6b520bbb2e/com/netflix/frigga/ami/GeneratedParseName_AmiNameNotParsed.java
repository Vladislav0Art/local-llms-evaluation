package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_AmiNameNotParsed {

    @Mock
    private String amiName;

    @Mock
    private Pattern pattern;

    @Test
    public void parseName_AmiNameNotParsed() {
        when(com.netflix.frigga.ami.AppVersion.parseName(amiName)).thenReturn(null);
        AppVersion appVersion = com.netflix.frigga.ami.AppVersion.parseName(amiName);
        assert appVersion == null;
    }

}