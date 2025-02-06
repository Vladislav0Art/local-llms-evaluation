package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedRun_withFileDoesNotContainExtension_ThrowsException {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_withFileDoesNotContainExtension_ThrowsException() {
        MockitoAnnotations.initMocks(this);
        String filePath = "path/to/epub/file";
        try {
            PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(filePath));
            epubChecker.run(new String[]{"-check", "-o"});
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

}