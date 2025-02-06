package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_ReturnsInvalidFileResult {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void run_ReturnsInvalidFileResult() throws Exception {
        when(EpubCheckFactory.getInstance()).thenReturn(new EpubCheck() {
            @Override
            public int validateFile(String path, EPUBVersion version) {
                return 1;
            }
        });
        assertEquals(1, instance().run(args));
    }

}