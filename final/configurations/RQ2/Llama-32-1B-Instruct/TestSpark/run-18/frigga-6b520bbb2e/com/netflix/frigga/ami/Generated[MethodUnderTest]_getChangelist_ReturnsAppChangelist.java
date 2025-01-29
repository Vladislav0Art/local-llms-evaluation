package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_getChangelist_ReturnsAppChangelist {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_getChangelist_ReturnsAppChangelist() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appChangelist()).thenReturn("ami-changelist-1");
        String expected = "ami-changelist-1";
        Assert.assertEquals(expected, AppVersion.getChangelist());

        verify(AppVersion.class).getChangelist();
    }

}