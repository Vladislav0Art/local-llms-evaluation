package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_getParseName_ReturnsParsedString {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_getParseName_ReturnsParsedString() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-123");
        String expected = "ami-name-123";
        Assert.assertEquals(expected, AppVersion.getParseName());

        verify(parseNameResult).parseName("ami-name-123");
    }

}