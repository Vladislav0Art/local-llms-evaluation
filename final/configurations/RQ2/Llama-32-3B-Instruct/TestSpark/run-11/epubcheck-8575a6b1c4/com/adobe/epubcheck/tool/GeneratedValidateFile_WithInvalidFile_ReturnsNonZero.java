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
public class GeneratedValidateFile_WithInvalidFile_ReturnsNonZero {

    @Test
    public void validateFile_WithInvalidFile_ReturnsNonZero() throws IOException {
        when(URLUtils.isEpubFile(Mockito.any(File.class))).thenReturn(false);
        PowerMockito.mockStatic(EpubCheckFactory.class);
        when(EpubCheckFactory.getInstance().validateFile(Mockito.anyString(), Mockito.any(EPUBVersion.class), Mockito.any(Report.class), Mockito.any(EPUBProfile.class))).thenReturn(-1);
        int result = new EpubChecker().validateFile(new File("a.html"), EPUBVersion.V3, new Report(), new EPUBProfile());
        assertEquals(-1, result);
    }

}