package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedRun_withInvalidArgs_ThrowsException {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_withInvalidArgs_ThrowsException() {
        MockitoAnnotations.initMocks(this);
        String[] args = {"-a", "-b"};
        try {
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(args));
            epubChecker.run(args);
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

}