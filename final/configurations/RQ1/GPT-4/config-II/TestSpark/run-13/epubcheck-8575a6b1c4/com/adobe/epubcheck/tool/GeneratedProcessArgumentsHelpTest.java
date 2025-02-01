package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessArgumentsHelpTest {

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void processArgumentsHelpTest() {
        String[] args = new String[]{"--help"};
        assertEquals(true, epubChecker.processArguments(args));
    }

}