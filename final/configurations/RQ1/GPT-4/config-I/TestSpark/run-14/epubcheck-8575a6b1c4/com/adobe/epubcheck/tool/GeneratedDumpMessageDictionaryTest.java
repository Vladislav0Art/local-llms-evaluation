package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import io.mola.galimatias.URL;
import org.w3c.epubcheck.core.Checker;

public class GeneratedDumpMessageDictionaryTest {

    @Test
    public void dumpMessageDictionaryTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.dumpMessageDictionary(Mockito.mock(Report.class));
    }

}