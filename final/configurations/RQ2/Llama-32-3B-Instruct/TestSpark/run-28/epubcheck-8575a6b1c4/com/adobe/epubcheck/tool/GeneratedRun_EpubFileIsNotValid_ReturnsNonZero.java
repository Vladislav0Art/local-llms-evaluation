package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_EpubFileIsNotValid_ReturnsNonZero {

    @Mock
    private EpubCheckFactory epubCheckFactory;

    @Mock
    private LocalizableReport report;

    public Locale getLocale() {
        return Locale.US;
    }

    @Test
    public void run_EpubFileIsNotValid_ReturnsNonZero() throws Exception {
        when(epubCheckFactory.getEpubChecker()).thenReturn(new EpubChecker());
        when(report.generate(anyString())).thenReturn("error message");
        int result = EpubChecker.run(new String[]{"-e", "test.epub"});
        assertTrue(result != 0);
    }

}