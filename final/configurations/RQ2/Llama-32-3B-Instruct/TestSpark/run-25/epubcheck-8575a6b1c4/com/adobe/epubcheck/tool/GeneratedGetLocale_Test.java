package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetLocale_Test {

    @Test
    public void getLocale_Test() {
        EpubChecker epubChecker = new EpubChecker();
        Locale locale = Mockito.mock(Locale.class);
        Mockito.when(epubChecker.getLocale()).thenReturn(locale);
    }

}