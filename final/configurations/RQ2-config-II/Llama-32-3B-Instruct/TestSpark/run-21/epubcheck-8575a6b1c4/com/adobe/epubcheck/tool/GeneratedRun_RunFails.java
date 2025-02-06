package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_RunFails {

    @Mock
    private Locale locale;

    @Mock
    private FileResourceProvider fileResourceProvider;

    @Mock
    private URLResourceProvider urlResourceProvider;

    @Mock
    private Archive archive;

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void run_RunFails() throws Exception {
        String[] args = new String[]{"path", "profile"};
        int result = epubChecker.run(args);
        assertNull(result);
    }

}