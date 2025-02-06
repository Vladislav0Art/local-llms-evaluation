package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedValidateFile_InvalidFile {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void validateFile_InvalidFile() {
        MockitoAnnotations.initMocks(this);
        String path = "path/to/invalid/file.epub";
        try {
            PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
            epubChecker.validateFile(path, EPUBVersion.EPUB30, new DefaultReportImpl(), profile);
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

}