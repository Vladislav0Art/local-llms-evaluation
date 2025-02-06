package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedRun_EpubCheckCommand {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_EpubCheckCommand() throws Exception {
        MockitoAnnotations.initMocks(this);
        String[] args = {"-check"};
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(args));
        String result = epubChecker.run(args);
        assertNotNull(result);
    }

}