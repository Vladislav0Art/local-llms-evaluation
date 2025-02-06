package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedValidateFile_ValidateRemoteFile {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void validateFile_ValidateRemoteFile() throws Exception {
        MockitoAnnotations.initMocks(this);
        String path = "http://example.com/valid/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
        int result = epubChecker.validateFile(path, EPUBVersion.EPUB30, new DefaultReportImpl(), profile);
        assertEquals(0, result);
    }

}