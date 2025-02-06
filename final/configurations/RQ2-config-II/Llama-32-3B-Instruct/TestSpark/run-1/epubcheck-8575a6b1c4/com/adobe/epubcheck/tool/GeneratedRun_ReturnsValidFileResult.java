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
public class GeneratedRun_ReturnsValidFileResult {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void run_ReturnsValidFileResult() throws Exception {
        when(EpubCheckFactory.getInstance()).thenReturn(new EpubCheck() {
            @Override
            public int validateFile(String path, EPUBVersion version) {
                return 0;
            }
        });
        assertEquals(0, instance().run(args));
    }

}