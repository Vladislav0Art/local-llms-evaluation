package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.Locale;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocaleDefaultTest {

    @Mock
    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void getLocaleDefaultTest() {
        Locale expected = Locale.getDefault();
        Locale actual = epubChecker.getLocale();
        Assert.assertEquals(expected, actual);
    }

}