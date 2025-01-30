package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.tool.EpubChecker;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

public class GeneratedProcessArgumentsInvalidArgumentsTest {

    @Test
    public void processArgumentsInvalidArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        boolean result = epubChecker.processArguments(new String[]{"./test.epub"});
        assertFalse(result);
    }

}