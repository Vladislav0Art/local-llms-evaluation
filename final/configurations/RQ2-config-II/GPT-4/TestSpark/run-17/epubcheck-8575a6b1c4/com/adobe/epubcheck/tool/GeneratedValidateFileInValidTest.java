package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileInValidTest {

    @Mock
    EpubChecker epubChecker;

    @Test
    public void validateFileInValidTest() throws IOException {
        File temp = File.createTempFile("temp", ".txt");
        String path = temp.getAbsolutePath();
        DefaultReportImpl report = new DefaultReportImpl(path);
        when(epubChecker.validateFile(path, EPUBVersion.VERSION_2, report, EPUBProfile.OPF_2_0))
                .thenThrow(new IOException("Invalid file type"));
        epubChecker.validateFile(path, EPUBVersion.VERSION_2, report, EPUBProfile.OPF_2_0);
        verify(epubChecker, times(1)).validateFile(path, EPUBVersion.VERSION_2, report, EPUBProfile.OPF_2_0);
        temp.delete();
    }

}