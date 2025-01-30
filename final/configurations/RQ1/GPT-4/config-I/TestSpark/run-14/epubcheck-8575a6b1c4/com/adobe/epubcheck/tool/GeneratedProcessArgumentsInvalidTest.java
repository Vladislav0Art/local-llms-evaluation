package com.adobe.epubcheck.tool;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import io.mola.galimatias.URL;
import org.w3c.epubcheck.core.Checker;

public class GeneratedProcessArgumentsInvalidTest {

    @Test
    public void processArgumentsInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        assertFalse(epubChecker.processArguments(new String[]{""}));
    }

}