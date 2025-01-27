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
public class GeneratedRun_WithArgs_ReturnsZero {

    @Test
    public void run_WithArgs_ReturnsZero() {
        PowerMockito.mockStatic(EpubCheckFactory.class);
        when(EpubCheckFactory.getInstance().run(Mockito.anyArray(String[].class))).thenReturn(0);
        int result = new EpubChecker().run(new String[]{"a", "b"});
        assertEquals(0, result);
    }

}