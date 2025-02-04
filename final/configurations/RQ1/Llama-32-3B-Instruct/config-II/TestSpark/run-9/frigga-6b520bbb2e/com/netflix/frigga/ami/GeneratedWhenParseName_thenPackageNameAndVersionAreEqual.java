package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenParseName_thenPackageNameAndVersionAreEqual {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void whenParseName_thenPackageNameAndVersionAreEqual() {
        AppVersion parsedName = AppVersion.parseName("packageNameversion");
        assertEquals("packageName", parsedName.packageName);
        assertEquals("version", parsedName.version);
    }

}