package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedValidateFile_InvalidVersion {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void validateFile_InvalidVersion() throws Exception {
        MockitoAnnotations.initMocks(this);
        String path = "path/to/valid/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
        try {
            epubChecker.validateFile(path, EPUBVersion.INVALID_VERSION, new DefaultReportImpl(), profile);
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            //expected
        }
    }

}