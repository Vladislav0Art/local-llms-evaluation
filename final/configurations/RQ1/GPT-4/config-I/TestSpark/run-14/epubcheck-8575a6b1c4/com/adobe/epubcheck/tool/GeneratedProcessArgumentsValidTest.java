package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import io.mola.galimatias.URL;
import org.w3c.epubcheck.core.Checker;

public class GeneratedProcessArgumentsValidTest {

    @Test
    public void processArgumentsValidTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertTrue(epubChecker.processArguments(new String[]{"path/to/epub"}));
    }

}