package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.testutil.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedGetLocale_WithEmptyString_ReturnsNull {

    @Test
    public void getLocale_WithEmptyString_ReturnsNull() {
        when(EpubCheckFactory.getInstance().getLocale()).thenReturn(null);
        Locale locale = new EpubChecker().getLocale();
        assertNull(locale);
    }

}