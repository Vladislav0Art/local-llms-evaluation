package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_EmptyString_ThrowsNullPointerException {

    @Mock
    private Pattern getAppVersionPattern();

    @Mock
    private NameConstants NameConstants;

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        when(NameConstants.getAppVersionParser()).thenReturn(new Matcher());
        assertNull(AppVersion.parseName(""));
    }

}