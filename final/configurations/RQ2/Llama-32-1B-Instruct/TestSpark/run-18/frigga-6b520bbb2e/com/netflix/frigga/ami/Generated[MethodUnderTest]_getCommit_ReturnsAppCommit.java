package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_getCommit_ReturnsAppCommit {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_getCommit_ReturnsAppCommit() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appCommit()).thenReturn("ami-commit-123");
        String expected = "ami-commit-123";
        Assert.assertEquals(expected, AppVersion.getCommit());

        verify(AppVersion.class).getCommit();
    }

}